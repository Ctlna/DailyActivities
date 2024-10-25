# API de Registro de Actividades Diarias

## Tabla de Contenidos
- [Descripción del Proyecto](#descripción-del-proyecto)
- [Problemática](#problemática)
- [Funcionalidades Principales](#funcionalidades-principales)
- [Tecnologías Recomendadas](#tecnologías-recomendadas)
- [Casos de Uso](#casos-de-uso)
- [Estructura de la API](#estructura-de-la-api)
- [Endpoints](#endpoints)
- [Formato de Respuesta](#formato-de-respuesta)
- [Formato de Documentación](#formato-de-documentación)
- [Rúbrica Evaluativa](#rúbrica-evaluativa)

## Descripción del Proyecto

La **API de Registro de Actividades Diarias** es una herramienta para ayudar a los usuarios a organizar, registrar y hacer un seguimiento de sus actividades y metas cotidianas. Con esta API, se puede gestionar tareas personales y profesionales de manera detallada, permitiendo un control exhaustivo sobre el tiempo y prioridades.

## Problemática

Las personas enfrentan desafíos en el manejo de sus tareas diarias y objetivos a largo plazo, lo cual afecta su productividad y organización. Esta API soluciona problemas de seguimiento de progreso, establecimiento de metas, organización de tareas y colaboración en proyectos.

## Funcionalidades Principales

- **Registro de Actividades**: Permite a los usuarios registrar actividades diarias con atributos específicos.
- **Seguimiento de Progreso**: Actualización del estado de las actividades, incluyendo gráficas de rendimiento.
- **Establecimiento de Metas**: Posibilidad de fijar y seguir metas personales.
- **Categorías y Etiquetas**: Organización de actividades en categorías y etiquetas personalizables.
- **Prioridades y Recordatorios**: Asignación de prioridades y configuración de recordatorios.
- **Visualización y Reportes**: Generación de reportes de productividad.
- **Sincronización Multidispositivo**: Permite la sincronización en tiempo real.
- **Colaboración**: Posibilidad de compartir actividades y colaborar en equipo (opcional).

## Tecnologías Recomendadas

- **Backend**: Node.js (Express) o Java (Spring Boot)
- **Base de Datos**: MongoDB, PostgreSQL o MySQL
- **Autenticación**: JWT para gestión de sesiones seguras

Consulta más detalles sobre las tecnologías en este [recurso](https://drive.google.com/drive/folders/1xqWMQHUWFMq_ovgsP-eD4zud5_xUYcYT?usp=drive_link).

## Casos de Uso

- Productividad personal
- Seguimiento de hábitos
- Gestión de proyectos simples
- Organización académica

## Estructura de la API

1. **Acceso a la API**: Requiere autenticación JWT, con sesiones válidas por 30 minutos.
2. **Límites de tasa**: Diferentes límites de solicitudes por tipo de método (consultar documentación).
3. **Mensajes de error**: Mensajes personalizados al alcanzar el límite de tasa o sesión expirada.

## Endpoints

### Ejemplo de Endpoints

| Método | Endpoint                   | Descripción                             |
|--------|-----------------------------|-----------------------------------------|
| POST   | `/usuarios`                 | Crear un nuevo usuario                  |
| GET    | `/usuarios/{id}`            | Obtener un usuario por ID               |
| PUT    | `/usuarios/{id}`            | Actualizar un usuario específico        |
| DELETE | `/usuarios/{id}`            | Eliminar un usuario específico          |
| POST   | `/actividades`              | Crear una nueva actividad               |
| GET    | `/actividades/{id}`         | Obtener una actividad específica        |

Consulta la documentación para una lista completa de endpoints.

## Formato de Respuesta

```json
{
    "status": "status code",
    "message": "Mensaje opcional",
    "data": { /* Datos solicitados */ }
}
