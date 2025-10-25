# Gym - Backend
Gym Tracker es una API backend desarrollada con Spring Boot siguiendo una arquitectura hexagonal, diseñada para gestionar usuarios, rutinas y progreso en el gimnasio.
Actualmente el proyecto se encuentra en la fase 1 (Spring Boot + Arquitectura Hexagonal – CRUD de Usuarios).
Proyecto backend para la app de seguimiento de rutinas y progresos de gym.

## Arquitectura
gymtracker/
 ├── application/           → Lógica de aplicación (casos de uso)
 ├── domain/                → Entidades y puertos (interfaces)
 ├── infraestructure/       → Adaptadores: controladores REST, repositorios JPA, configuración
 ├── GymtrackerApplication.java
 └── resources/
     ├── application.yml    → Configuración de PostgreSQL
     └── ...

## Git & GitFlow
- Repo inicializado con ramas `main`, `develop` y una rama de feature de ejemplo.
- README y .gitignore incluidos.

## Tecnologías utilizadas

- Java 21
- Spring Boot 
- Spring Data JPA
- PostgreSQL
- H2 (para pruebas)
- Git & GitFlow

## Endpoints disponibles (Usuarios)

Base URL: http://localhost:8080/api/usuarios
| Método | Endpoint | Descripción |
|--------|-----------|-------------|
| `POST` | `/api/usuarios` | Crear usuario |
| `GET` | `/api/usuarios` | Listar todos los usuarios |
| `GET` | `/api/usuarios/{id}` | Obtener usuario por ID |
| `PUT` | `/api/usuarios/{id}` | Actualizar usuario |
| `DELETE` | `/api/usuarios/{id}` | Eliminar usuario |

