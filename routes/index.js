const express = require ('express');
const router =  express.Router();
const homeControllers = require('../controllers/homeController');
const vacantesController = require('../controllers/vacantesController');


module.exports = () => {
    router.get('/', homeControllers.mostrarTrabajos);

    //crear vacantes

    router.get('/vacantes/nueva', vacantesController.formularioNuevaVacante);
    router.post('/vacantes/nueva', vacantesController.agregarVacante);


    // mostrar vacante (singular)
    router.get('/vacantes/:url', vacantesController.mostrarVacante);

    // editar vacante
    router.get('/vacantes/editar/:url', vacantesController.formEditarVacante);
    router.post('/vacantes/editar/:url', vacantesController.editarVacante);

    return router;
}