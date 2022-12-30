# DynamoDB + Spring Boot

### Visión General

1. Mediante las herramientas de desarrollo del navegador (F12 en Chrome y Firefox), explorar las peticiones hechas al API de Finerio (https://api.finerio.mx/api)
2. Analizar los endpoints:
	 - POST /login
	 - GET /me
	 - GET /movements
3. Utilizar los endpoints anteriores para implementar un microservicio que los utilice de la siguiente forma:
	 - Iniciar sesión en el API
	 - Si el inicio de sesión no es exitoso, mostrar un mensaje de error.
	 - Si el inicio de sesión es exitoso, obtener los primeros 10 movimientos y persistir en una base de datos. Posteriormente se debe invocar al API nuevamente para obtener los siguientes 10 movimientos y guardarlos.
	 - En la persistencia de datos, si el movimiento ya ha sido persistido anteriormente, no guardar, solo actualizar.
	 - Debe exponerse un endpoint llamado “runTest” de tipo GET con Basic Authentication para ejecutar todo lo solicitado.
	 - Todas las ejecuciones deben mostrarse en la línea de comandos.