INSERT INTO persona (id_persona, apellidos, nombres, cedula,correo,direccion,fecha_nacimiento,foto,genero,telefono) VALUES (1, null, null, '1111' ,null,null,null,null,null,null);

INSERT INTO empresa(id_empresa, alias, celular, ciudad, correo, direccion, logotipo, nombre_comercial, provincia, razon_social, ruc)
	VALUES (1, null,null, null, null, null, null, null, null, null, null);

INSERT INTO roles(
	id_rol, descripcion, estado, nombre_rol)
	VALUES (1, 'ADMINISTRADOR', true, 'ADMIN');

INSERT INTO usuario(
	id_usuario, cedula, contrasenia, estado, nombres, username, empresa_id_empresa, persona_id_persona, rol_id_rol)
	VALUES (1, '1111', 'admin', true, 'ADMIN', 'admin', 1, 1, 1);