REQUISITOS:
- Docker Desktop
- Node.js LTS
- npm

EJECUTAR BACKEND:
1. Abrir terminal en la carpeta raíz del proyecto.
2. Ejecutar:
   docker compose up --build

VALIDAR BACKEND:
- Eureka: http://localhost:8761
- Gateway vehículos: http://localhost:8080/api/vehiculos
- Swagger vehículos: http://localhost:8081/swagger-ui/index.html
- Swagger operaciones: http://localhost:8082/swagger-ui/index.html

EJECUTAR FRONTEND:
1. Abrir otra terminal.
2. Entrar a la carpeta del frontend:
   cd SistemaAlquilerVehiculosJLCB
3. Ejecutar:
   npm install
   npm run dev

ABRIR FRONTEND:
http://localhost:5173