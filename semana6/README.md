# Proyecto final · Semana 6 · GitHub Copilot


**Alumno:** `Maria del Carmen Chavez Conde` · **Usuario de GitHub:** `carmencc`

## 1. Qué construí


| | Feature | Especificación |
|---|---|---|

| [x] | `PATCH /tasks/{id}/assignee` — cambiar el responsable | [`specs/assignee.md`](../specs/assignee.md) |


## 2. El pull request

- **URL del PR (mergeado):** `https://github.com/carmencc/taskflow-copilot-carmencc/pull/7`
- **Commit del merge en `main`:** `20a27ab (HEAD -> main, origin/main, origin/HEAD) Merge pull request #7 from carmencc/feature/assignee`
- **Comentarios de Copilot code review:** `1 y lo arreglé a mano`

## 3. Cómo lo hice


| Paso | Qué hice | Evidencia |

| Rama y spec | `git switch -c feature/assignee` y copié la spec a `specs/` | `git log --oneline main..feature/assigne` (antes del merge) |
| Implementación | `copilot -p "/crear-endpoint-taskflow …"` con `gpt-5-mini` | `semana6/sesion-implementacion.md` (tiene la línea `Skill "crear-endpoint-taskflow" loaded successfully`) |
| Revisión | agente `revisor` sobre `semana6/proyecto-final.diff` | `semana6/revision.md` (termina con `Veredicto:`) |
| Tests | `mvn test` en verde | `[OK]    GET /tasks/overdue devuelve solo la tarea 7
[OK]    GET /tasks/unassigned devuelve las tareas 4 y 6
[OK]    GET /projects/1/summary
[OK]    GET /projects/2/summary
[OK]    GET /projects/3/summary
[OK]    GET /projects/99/summary responde 404
[OK]    GET /projects/1/summary sin token responde 401
[OK]    PATCH /tasks/4/assignee asigna a luis
[OK]    GET /tasks/4 conserva el responsable nuevo
[OK]    PATCH /tasks/4/status a DONE ahora responde 200
[OK]    PATCH /tasks/2/assignee (DONE) responde 422
[OK]    PATCH /tasks/99/assignee responde 404
[OK]    PATCH /tasks/6/assignee con {} responde 400 y nombra assigneeId
[OK]    PATCH /tasks/6/assignee con 0 responde 400
[OK]    PATCH /tasks/6/assignee sin token responde 401` |
| Comprobación REST | `verificar.ps1` con `casos-assignee.ps1` | sección 5 de este documento |
| Code review | Copilot en el PR | la pestaña *Files changed* del PR |

## 4. Qué hizo el agente y qué corregí yo



| # | Qué hizo mal el agente (archivo) | Quién lo detectó | Cómo quedó corregido |
|1|Sugeria el cambio de nombre  patchAssignee_proyectoInexistente_devuelve404 por patchAssignee_tareaInexistente_devuelve404|Lo cambie a mano, se encontraba en la clase ReasignarTareaControllerTest.java|void patchAssignee_tareaInexistente_devuelve404() |


**Lo que el agente hizo bien a la primera** (una o dos líneas): `<qué archivos o casos no tuviste que tocar>`

## 5. Comprobaciones REST


```text
URL de la app: http://127.0.0.1:8080
Empaquetando con Maven (mvn -q package -DskipTests), tarda unos segundos...
App arrancando (PID 11180). Esperando a que /info responda...
App lista en 6 s.
[OK]    GET /tasks/overdue devuelve solo la tarea 7
[OK]    GET /tasks/unassigned devuelve las tareas 4 y 6
[OK]    GET /projects/1/summary
[OK]    GET /projects/2/summary
[OK]    GET /projects/3/summary
[OK]    GET /projects/99/summary responde 404
[OK]    GET /projects/1/summary sin token responde 401
[OK]    PATCH /tasks/4/assignee asigna a luis
[OK]    GET /tasks/4 conserva el responsable nuevo
[OK]    PATCH /tasks/4/status a DONE ahora responde 200
[OK]    PATCH /tasks/2/assignee (DONE) responde 422
[OK]    PATCH /tasks/99/assignee responde 404
[OK]    PATCH /tasks/6/assignee con {} responde 400 y nombra assigneeId
[OK]    PATCH /tasks/6/assignee con 0 responde 400
[OK]    PATCH /tasks/6/assignee sin token responde 401
App detenida (PID 11180).
[OK]    App apagada: el puerto 8080 ya no responde
RESULTADO: 16/16 OK
```

## 6. Créditos de la semana



| Qué | AI credits |
|---|---|
| Usados en octubre según github.com (incluye semanas anteriores si usaste Copilot antes) | `$3.03` |
| Implementación con la skill (`AI Credits` del PF-2) | `4.62` |
| Revisión del `revisor` (`AI Credits` del PF-3) | `0.86` |
| Correcciones del PF-4 y del PF-6, si hubo (`AI Credits`) | `0` |
