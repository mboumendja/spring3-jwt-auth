## A Spring Boot demo app with jwt authentication using nimbus jose

# To generate the private rsa key do
* openssl genrsa -out private.pem 2038

# To generate the public key
* openssl rsa -in private -pubout -out public.pem

If you don't have openssl installed, you can get it at [openssl](https://slproweb.com/products/Win32OpenSSL.html).