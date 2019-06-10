document.addEventListener('DOMContentLoaded', () => {
    const skills = document.querySelector('.lista-conocimientos');

    // una vez que estamos en editar , llamar a funcion

    skillsSeleccionados();

    if (skills){
        skills.addEventListener('click', agregarSkills);
    }
})

const skills = new Set();
const agregarSkills = e => {
   if(e.target.tagName === 'LI'){
       if(e.target.classList.contains('activo')){
           // quitar deñ set y quitar la clase
           skills.delete(e.target.textContent);
       e.target.classList.remove('activo');
       } else {
           // agragarlos al set y agregar la clase
           skills.add(e.target.textContent);
            e.target.classList.add('activo');
       }
   } 
   const skillsArrray = [...skills]
   document.querySelector('#skills').value = skillsArrray;
}

const skillsSeleccionados = () => {
    const seleccionadas = Array.from(document.querySelectorAll('.lista-conocimientos .activo'));

    seleccionadas.forEach(seleccionada =>{
        skills.add(seleccionada.textContent);
    })
    
    // inyectarlo en el hidden

    const skillsArrray = [...skills]
   document.querySelector('#skills').value = skillsArrray;
}