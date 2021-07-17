//Attributes
const button = document.querySelector('button')
const h1 = document.querySelector('#quote')
const quote = document.createElement('span')
const h2 = document.querySelector('#author')
const author = document.createElement('span')
const quoteList = [
                "Excellent! I cried. \"Elementary,\" said he.", 
                "You know my methods, Watson.",
                "When you have eliminated the impossible, whatever remains, however improbable, must be the truth.",
                "London, that great cesspool into which all the loungers and idlers of the Empire are irresistibly drained.",
                "The lowest and vilest alleys in London do not present a more dreadful record of sin than does the smiling and beautiful countryside."]

//Functions
function changeQuote() {
    let quot = '"'
    const indexquote = parseInt((Math.random()*quoteList.length))
    quot += quoteList[indexquote]
    quote.textContent = quot+"\""
    h1.appendChild(quote)
    author.textContent = "- Sherlock Holmes -"
    h2.appendChild(author)
}

//call functions
quote.textContent = "Hit the button to see different quotes"
h1.appendChild(quote)
author.textContent = "Author"
h2.appendChild(author)
button.addEventListener('click', changeQuote)