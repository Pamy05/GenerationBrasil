/* -------------------------------
Declarando variaveis:
var = é um escopo global
let = é um escopo local
const = variavel local e constante 
--------------------------------*/
/*-----------------------------
 Outras formas de acesso dom:
Por tag: getElementByTagName()
por ID: getElementById()
por nome: getElementByName()
por classe: getElementsByClassName()
por seletor: querySelector()
------------------------------*/

let nome = window.document.getElementById('nome') //acessar o DOM 
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')


nome.style.width = '100%'
email.style.width = '100%'

function validaNome(){
    let txtNome = document.querySelector('#textNome')
    if(nome.value.length < 3){
        txtNome.innerHTML = 'Nome inválido'
        txtNome.style.color = 'red'
    }else {
        txtNome.innerHTML = 'Nome Válido'
        txtNome.style.color = 'green'
    }
}

function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail') 
 
    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ) {
       txtEmail.innerHTML = 'E-mail inválido'
       txtEmail.style.color = 'red'
    } else {
       txtEmail.innerHTML = 'E-mail válido'
       txtEmail.style.color = 'green'
       emailOk = true
    }
 }

 function validaAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')
 
    if (assunto.value.length >= 100) {
       txtAssunto.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
       txtAssunto.style.color = 'red'
       txtAssunto.style.display = 'block'
    } else {
       txtAssunto.style.display = 'none'
       assuntoOk = true
    }
 }

 function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk == true) {
       alert ('Formulário enviado com sucesso!')
    } else {
       alert ('Preencha o formulário corretamente antes de enviar...')
    }
 }
 
 function mapaZoom() {
    mapa.style.width = '800px'
    mapa.style.height = '600px'
 }
 
 function mapaNormal() {
    mapa.style.width = '400px'
    mapa.style.height = '250px'
 }
