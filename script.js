document.addEventListener('DOMContentLoaded', () => {
    const output = document.getElementById('terminal-output');
    const input = document.getElementById('user-input');
    const runBtn = document.getElementById('run-btn');
    const inputArea = document.getElementById('input-area');
 
    // Si no estamos en la página de simulación, salimos sin ejecutar nada
    if (!output || !input || !runBtn || !inputArea) {
        return;
    }
 
    let state = 'IDLE'; // IDLE, WAITING_NAME, WAITING_GRADE, FINISHED
    let students = [];
    let currentStudent = {};
    let count = 0;
    const TOTAL_STUDENTS = 5;

    function print(text, isInput = false) {
        const line = document.createElement('div');
        line.textContent = text;
        if (isInput) {
            line.style.color = '#4ade80';
        }
        output.appendChild(line);
        output.scrollTop = output.scrollHeight;
    }

    function startSimulation() {
        output.innerHTML = '';
        students = [];
        count = 0;
        state = 'WAITING_NAME';
        print('--- Iniciando Programa ---');
        print(`Ingrese el nombre del alumno ${count + 1}:`);
        inputArea.style.display = 'flex';
        input.focus();
        runBtn.textContent = 'Reiniciar Programa';
    }

    function processInput(value) {
        print(value, true); // Echo user input

        if (state === 'WAITING_NAME') {
            currentStudent = { name: value };
            state = 'WAITING_GRADE';
            print(`Ingrese la calificación de ${value}:`);
        } else if (state === 'WAITING_GRADE') {
            const grade = parseFloat(value);
            if (isNaN(grade) || grade < 0 || grade > 100) {
                print('Error: Por favor ingrese una calificación válida (0-100).');
                print(`Ingrese la calificación de ${currentStudent.name}:`);
                return;
            }
            currentStudent.grade = grade;
            students.push(currentStudent);
            count++;

            if (count < TOTAL_STUDENTS) {
                state = 'WAITING_NAME';
                print(`Ingrese el nombre del alumno ${count + 1}:`);
            } else {
                finishSimulation();
            }
        }
    }

    function finishSimulation() {
        state = 'FINISHED';
        print('--------------------------');
        print('Resultados:');
        
        let sum = 0;
        students.forEach(s => {
            print(`Alumno: ${s.name} - Calificación: ${s.grade}`);
            sum += s.grade;
        });

        const average = sum / TOTAL_STUDENTS;
        print('--------------------------');
        print(`El promedio del grupo es: ${average.toFixed(2)}`);
        print('--- Fin del Programa ---');
        
        // Hide input but keep focus away
        input.blur();
    }

    runBtn.addEventListener('click', startSimulation);

    input.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            const value = input.value.trim();
            if (value) {
                processInput(value);
                input.value = '';
            }
        }
    });

    // Initial state
    inputArea.style.display = 'none';
});
