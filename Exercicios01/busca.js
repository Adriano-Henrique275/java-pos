const searchWord = document.querySelector('#textWord');

const db = "Essa é a frase encontrada no banco de dados. Ola mundo";

const palavra = document.querySelector('#search');

// repositorio do QA

function buscaPalavra(){
  if(!palavra.value){
    searchWord.innerHTML = 'Digite alguma palavra!';
    return;
  }

  if(db.toLowerCase().includes(palavra.value.toLowerCase())){
    searchWord.innerHTML = 'Essa palavra existe!';
    return;
  }
  
   searchWord.innerHTML = 'Não existe essa palavra!';  
}