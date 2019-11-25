const mongoose = require('mongoose');
require ('dotenv').config({path: 'variables.env'});

mongoose.connect(process.env.DATABASE, {
    useCreateIndex: true,
    useNewUrlParser:true,
    useUnifiedTopology: true
    //useNewUrlParser: true,
});

mongoose.connection.on('error', (error) => {
    console.log(error);
})

// importar los modeloes
require('../models/Usuarios');
require('../models/vacantes');