## A Spring Boot demo app with jwt authentication using nimbus jose

## To generate the private and public rsa key do
```bash
openssl genrsa -out private.pem 2048
```
```bash
openssl rsa -in private -pubout -out public.pem
```
If you don't have openssl installed, you can get it at [openssl](https://slproweb.com/products/Win32OpenSSL.html).