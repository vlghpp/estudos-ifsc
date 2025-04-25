const express = require('express')
const app = express()
const port = 3000
app.use(express.json())

app.get("/hello", (req, res) => {
    res.send("HELLO WORD!!")
})

app.listen(port, ()=>{
    console.log(`Servidor rodando na porta ${port}`);
    
})
