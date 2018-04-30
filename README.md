
### Python

#### Requisitos

- Python usa o OpenSSL fornecida pelo sistema.
- TLS 1.2 precisa da versão 1.0.1c OpenSSL ou superior.

#### Testando sua conexão com TLS 1.2.

1. Baixe [esse arquivo](Python/tls-example.py) em seu servidor.

2. Execute-o arquivo com o comando `python tls-example.py`

	* Em caso de sucesso, a seguinte mensagem será retornada:
	```
	Sucesso: sua conexão com a Pagar.me está utilizando o protocolo TLS 1.2.
	```

	* Em caso de falha, a seguinte mensagem será exibida:
	```
	Sua versão SSL é XXX
	Sua versão deve ser superior à 1.0.1c
	```
* * *

### .NET

#### Requisitos
Para habilitar o funcionamento do protocolo TLSv1.2 em seu sistema, a única coisa necessária é utilizar a versão mais recente do Mono(linux) ou .NET Framework (4.5 ou maior).

#### Verificando suas versões de .NET e TLS

1. Execute o arquivo `tls-example.exe`, que pode ser encontrado clicando [aqui](https://github.com/pagarme/TLS-update/blob/master/C%23/):

##### Windows:
  Execute o arquivo como qualquer outro `.exe` normalmente.

##### Linux:
  - Execute o comando a partir do `mono` da seguinte maneira:
    ```
    $ mono tls-example.exe
    ```

  * Caso a requisição retorne sucesso, a seguinte mensagem será exibida em seu terminal:
    ```
    "Sucesso: sua conexão com a Pagar.me está utilizando o protocolo TLS 1.2."
    ```
#### Links:
  - [Exemplo completo](https://github.com/pagarme/TLS-update/tree/master/C%23)

* * *

### Node

#### Requisitos

- O Node utiliza o OpenSSL instalado no sistema
- O TLSv1.2 exige que a versão mínima do OpenSSL seja a 1.0.1c

#### Determinando a versão do SSL

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

#### Executando exemplo de Node

1. Baixe o arquivo `tls-example.js` do nosso [repositório](https://github.com/pagarme/TLS-update/blob/docs/node/Node/tls-example.js).
2. Coloque-o em seu servidor, e execute-o com o comando `node tls-example.js`

* * *
### PHP

#### Requisitos
* Versão do PHP: >= 5.3 
* Versão da biblioteca cURL: >= 7.34.0
* Versão da biblioteca OpenSSL: >= 1.0.1c

* O PHP utiliza o curl fornecido pelo sistema, e precisa possuir a versão do OpenSSL igual ou superior à 1.0.1c.
* Você pode precisar [atualizar suas bibliotecas SSL/TLS](http://curl.haxx.se/docs/ssl-compared.html).

#### Guias

Você pode encontrar informações sobre as bibliotecas OpenSSL dessa forma:

1. OpenSSL instalado em seu SO: 
    - Execute o comando `openssl version`.
1. OpenSSL que seu PHP está utilizando:
    - Procure essa informação dentro do arquivo `php.ini`.
1. Para encontrar a versão do OpenSSL de seu cURL, execute o comando abaixo em seu servidor
    ```
    php -r 'echo json_encode(curl_version(), JSON_PRETTY_PRINT);'
    ```

Todas essas bibliotecas OpenSSL podem ser diferentes, e atualizar uma não atualizará a outra automaticamente.

O `php_curl` usa sua própria versão da biblioteca OpenSSL, que não é a mesma que o PHP usa, que estão nos arquivos `openssl.so` e `php.ini`.

#### Testando sua conexão com TLS 1.2

1. Baixe [esses arquivos](PHP/) em seu servidor.

1. Execute esses comandos no terminal de seu servidor:

    ```
    php tls-example.php
    ```

    * Em caso de sucesso:
        
        ```
        Sucesso: sua conexão com a Pagar.me está utilizando o protocolo TLS 1.2.
        ```
        
    * Em caso de falha um dos erros abaixo deve ocorrer:
            
        ```
        Peer's Certificate issuer is not recognized

        ```

        ```
        Unable to connect to api.pagar.me
        ```

1. Ao atualizar bibliotecas OpenSSL, você precisa atualizar a versão do OpenSSL de seu `php_curl`, e não a versão do OpenSSL de seu servidor operacional.

**Nota:** Tenha certeza que os testes executados em seu terminal utilizam a mesma versão de PHP e bibliotecas SSL/TLS que seu servidor web. Se você usar MAMPP ou XAMPP, o PHP já é configurado com a versão mais antiga do OpenSSL, onde pode ser complicado atualizar. 
Alguns links que podem te ajudar nessa atualização são esses:

* [change-openssl-version-in-mamp](https://stackoverflow.com/questions/33887552/change-openssl-version-in-mamp)
* [Unknown SSL protocol error](https://github.com/paypal/PayPal-PHP-SDK/issues/484#issuecomment-176240130)
* [PHP - OpenSSL Installation](http://php.net/manual/pt_BR/openssl.installation.php)

* * * 
### Java 

#### TLS V1.2 no Java

Na versão 1.6 do Java, o TLS v1.2 está disponível a partir da atualização de número 11. Caso necessário, atualize JDK de seu servidor, as versões mais recentes estão disponíveis [aqui](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase6-419409.html). 

Na versão 1.7 e 1.8 do Java  o suporte para TLS v1.2 é nativo. 

A habilitação deste recurso depende do servidor que sua aplicação está utilizando. 

##### Vericando se o seu servidor é capaz de realizar requisições utilizando o TLS v.12

Obtenha o arquivo .jar [aqui](https://github.com/pagarme/TLS-update/blob/readmeJava/Java/TLS.jar)

###### Windows 

Dê um duplo clique sobre o arquivo TLS.jar

###### Linux 

Execute o seguinte comando a partir do terminal na pasta que contém o arquivo TLS.jar: 

java -jar TLS.jar 

Classe completa [aqui](https://github.com/pagarme/TLS-update/blob/readmeJava/Java/TLS.java) 

* * *
### Ruby

#### Requisitons
  - É necessário que a versão de seu Ruby seja 2.0.0 ou superior, assim como a do OpenSSL 1.0.1c ou superior:
    - O Ruby 2.0.0 ou superior é necessário para que o mesmo consiga utilizar o TLSv1.2 do OpenSSL de seu próprio sistema;
    - Para conseguir utilizar o TLSv1.2 é necessário o OpenSSL 1.0.1c ou superior instalado em seu sistema.
  
  - Para atualizar as dependências de seu aplicativo, talvez seja necessário utilizar o comando `bundle update`.

#### Testando sua conexão com TSLv1.2
1. Execute o arquivo `tls-example.rb`, que pode ser encontrado [aqui](https://github.com/pagarme/TLS-update/tree/master/Ruby), da seguinte maneira:

    ```
    $ ruby tls-example.rb
    ```

    - Caso a requisição tenha sido feita com sucesso, a seguinte mensagem será exibida em seu terminal:
        ```
        Sucesso: sua conexão com a Pagar.me está utilizando o protocolo TLS 1.2.
        ```
    - Caso ocorra alguam erro na requisição devido ao protocolo TLS, uma excessão será lançada.