// Criando uma Array e inicializando valores com []
let carro = ['Gol','Corsa','Palio','Kwid','Mobi','HB20','Onix','Fusca'];

// Criando uma Array e inicializando com valores com Arrya ()
let marca = new Array('Fiat','Ford','Jeep');

// Criando um Array vazio
let acessorios = [];
// ou
let categoria = new Array();

// Criando uma Arrya com um valor fixo
let cor = Array(5);

console.table(carro);
console.table(marca);
console.table(acessorios);
console.table(categoria);
console.table(cor);

// Adicionando um novo elemento no final da Array -> Push
carro.push('Logan')
console.table(carro);

// Adicionando um novo elemento no inicio da Array -> Unshift
carro.unshift("Compass");
console.table(carro);

// remover um elemento no final da Array -> Pop
carro.pop();
console.table(carro);

// removendo um elemento no inicio da Array -> Shift
carro.shift();
console.table(carro);

// remover um elemento atráves de uma posição específica -> Splice
carro.splice(1,1); // remove 1 elemento a partir do index 1


// remover um elemento atráves de um valor específico -> Filter
//tudo que for diferente de HB20 permanece
carro = carro.filter(f=> f!='HB20');
console.log('Filter: '+carro);

// substituir um elemento -> Splice
let carroNova = carro.splice(0,1,'Gol');
console.log('Splice: '+carroNova);

// Convertendo um Array para uma String -> Join
let texto = carro.join(', ');
console.log('Join: '+texto);

// Localizar um elemento na Array -> Find
let Localizar = carro.find(x=> x == 'Gol');
console.log('Find: '+Localizar); // Quando localiza -> retorna o valor procurado

// Localizar um elemento na Arrat -> Includes
let existe = carro.includes('Gol');
console.log('Include: '+existe);

// Ordena uma array em crescente (A-Z ou 0-N) -> Sort
carro.sort();
console.table(carro);

// Ordena uma Array decrescente (A-Z ou 0-N) -> Reverse
carro.reverse();
console.table(carro);

//-----------------------------------------------------------

let numeros = [1,2,3,4,5,6,7,8,9];
let dobra = numeros.map(x=> x*2);
console.log('Múltiplos do 2: '+dobra);

// Array mesclada
let mesclada = ['Ford','Ka',123,true,null,false,{cor:'vermelho'}];
console.log(mesclada);

// Array de objetos
let aluno = [
    {nome: 'Giovana', idade:22},
    {nome: 'Yago', idade: 21},
    {nome: 'Taina', idade: 19}
];
console.log(aluno);

// Acesso direto com Array simples
console.log("Objeto de index 1: "+carro[1]);
console.log("Objeto de index 2: "+carro[2]);
let veiculo = carro[3];
console.log(veiculo);

console.log(aluno[0]); // recuperando o objeto por completo
console.log(aluno[0].nome); //recuperando o valor do atributo que esta dentro do objeto

// O tamanho do vetor é verificado com -> lenght 
console.log('Quantidade de carros: '+carro.length);
console.log("-------------------------------");
/* Percorrendo uma Array 
for tradicional*/
for (let i=0;i<=carro.length;i++){
    console.log(carro[i]);
};
console.log("-------------------------------");
// forEach -> pega o objeto e percorre cada 
for (let c of carro){
    console.log(c);
}