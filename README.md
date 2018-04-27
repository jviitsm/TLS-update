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