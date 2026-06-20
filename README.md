## A Spring Boot demo app with jwt authentication using nimbus jose
There is a data.sql file in **/resources/** , use it to generate data in db

## To generate the private and public rsa key do

First create a foldre inside resources named **certs** and navigate to it.
```bash
openssl genrsa -out private.pem 2048
```
```bash
openssl rsa -in private.pem -pubout -out public.pem
```
If you don't have openssl installed, you can get it at [openssl](https://slproweb.com/products/Win32OpenSSL.html).