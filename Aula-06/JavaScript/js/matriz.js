// criando uma Matriz com  []
let matriz = [[1,2,3],[4,5,6],[7,8,9]];
console.table(matriz);

console.log("Acessando um index especifico de uma matriz");
console.log(matriz[0][0]);
console.log(matriz[0][1]);
console.log(matriz[0][2]);

console.log("Percorrendo uma matriz com dois FOR");
// 1° For -> coluna
// 2° For -> linha

for (let i=0;i<matriz.length;i++){
    for (let j=0;j<matriz[i].length;j++){
        console.log(matriz[i][j]);
    }
}

console.log("Percorrendo uma Matriz com forEach");

matriz.forEach(linha => {
    linha.forEach(valor => {
        console.log(valor);
    })
})
