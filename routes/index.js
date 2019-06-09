const express = require ('express');
const router =  express.Router();
const homeControllers = require('../controllers/homeController');
const vacantesController = require('../controllers/vacantesController');


module.exports = () => {
    router.get('/', homeControllers.mostrarTrabajos);

    //crear vacantes

    router.get('/vacantes/nueva', vacantesController.formularioNuevaVacante);
    router.post('/vacantes/nueva', vacantesController.agregarVacante);

    return router;
}