
const faturamento = require('./faturamento.json');

let datasDeEntradas = [];

/* Função que transforma o formato dd/MM/yyyy no padrão MM/dd/yyyy para usar os métodos da classe Date */

function transformaData(){
    return faturamento.map( item => {
        let objFaturamento = {
            entrada: Number(item.entrada),
            data: new Date(
                `${item.data.split("/")[1]}
                /${item.data.split("/")[0]}
                /${item.data.split("/")[2]}`
            )
        }
        datasDeEntradas.push(objFaturamento) ;
    }) 
}
transformaData()


/* Supondo-se que haja dados de faturamento inseridos nos finais de semana a função abaixo trata de filtrar apenas os dias da semana */

function eliminaFinalDeSemana() {
    return datasDeEntradas.filter(x => x.data.getDay() !== 6 && x.data.getDay() !== 0)
}

function operacoes() {
    const num = eliminaFinalDeSemana().map(x => Number(x.entrada))
    const avg = num.reduce( ( acc, cur ) => ( acc + cur ), 0 ) / num.length
    const diasMaioresQueOFaturamentoMedio = eliminaFinalDeSemana().filter( x => x.entrada > avg)
    console.log(eliminaFinalDeSemana().map(x => x.entrada))
    console.log("O menor valor de faturamento ocorrido em um dia do mês: R$ " + Math.max(...num).toFixed(2))
    console.log("O maior valor de faturamento ocorrido em um dia do mês: R$ " + Math.min(...num).toFixed(2))
    console.log("Numeros de dias de faturamento maior que a média mensal: " + diasMaioresQueOFaturamentoMedio.length + " dias")
}
operacoes()