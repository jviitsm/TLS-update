
## Node

### Requisitos

- O Node utiliza o OpenSSL instalado no sistema
- O TLSv1.2 exige que a versão mínima do OpenSSL seja a 1.0.1c

### Determinando a versão do SSL

1. Execute o seguinte comando em seu servidor
```
node -e "console.log(process.versions)"
```
2. A versão do seu OpenSSL será exibida na propriedade `openssl`:
```
{
  http_parser: '2.7.0',
  node: '8.6.0',
  v8: '6.0.287.53',
  uv: '1.14.1',
  zlib: '1.2.11',
  ares: '1.10.1-DEV',
  modules: '57',
  nghttp2: '1.25.0',
  openssl: '1.0.2l',
  icu: '59.1',
  unicode: '9.0',
  cldr: '31.0.1',
  tz: '2017b' 
}
```

### Executando exemplo de Node

1. Baixe o arquivo `tls-example.js` do nosso [repositório](https://github.com/pagarme/TLS-update/blob/docs/node/Node/tls-example.js).
2. Coloque-o em seu servidor, e execute-o com o comando `node tls-example.js`