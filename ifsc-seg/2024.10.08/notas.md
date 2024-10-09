# Aula 08/10/2024

## Propriedades básicas de segurança

- Confidencialidade
- Integridade
- Disponibilidade
  







## Exercicio em duplas - c/ Kauan <3

1. Colocar uma senha no arquivo e criptografa-la Ex: aes-256-cbc (força area americana)
   1. Código para fazer a criptografia:
   - `openssl aes-256-cbc -in senhas.txt -out senhas.enc -pbkdf2 -k secreta`


2. Enviar o checksum do arquivo para o companheiro verificar a integridade do arquivo. 
`

1. Criptografar a senha antes de gravar no banco de dados