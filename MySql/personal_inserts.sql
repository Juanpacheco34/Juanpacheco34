DROP DATABASE IF EXISTS personal;
CREATE DATABASE personal CHARACTER SET utf8mb4;
USE personal;

CREATE TABLE departamentos (
  id_depto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre_depto VARCHAR(20) NOT NULL,
  ciudad VARCHAR(15) NULL,
  nombre_jefe_depto CHAR(30) NULL
);


CREATE TABLE empleados (
  id_emp INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre CHAR(30) NOT NULL,
  sex_emp CHAR(1) NOT NULL,
  fec_nac DATE NOT NULL,
  fec_incorporacion DATE NOT NULL,
  sal_emp FLOAT NOT NULL,
  comision_emp FLOAT NOT NULL,
  cargo_emp VARCHAR(15) NOT NULL,
  id_depto INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_depto) REFERENCES departamentos(id_depto)
  );


-- Insertar datos en la tabla `departamentos`

INSERT INTO `departamentos` VALUES (1000,'GERENCIA','CIUDAD REAL','Bruno Cebrian');
INSERT INTO `departamentos` VALUES (1500,'PRODUCCIÓN','CIUDAD REAL','Jesica Duran');
INSERT INTO `departamentos` VALUES (2000,'VENTAS','CIUDAD REAL','Alicia Andres');
INSERT INTO `departamentos` VALUES (2100,'VENTAS','BARCELONA','Fabian Soto');
INSERT INTO `departamentos` VALUES (2200,'VENTAS','VALENCIA','Mari Plaza');
INSERT INTO `departamentos` VALUES (2300,'VENTAS','MADRID','Jonatan Acuña');
INSERT INTO `departamentos` VALUES (3000,'INVESTIGACIÓN','CIUDAD REAL','Valentina Sola');
INSERT INTO `departamentos` VALUES (3500,'MERCADEO','CIUDAD REAL','Abraham Diego');
INSERT INTO `departamentos` VALUES (4000,'MANTENIMIENTO','CIUDAD REAL','Raúl Carrero');
INSERT INTO `departamentos` VALUES (4100,'MANTENIMIENTO','BARCELONA','Catalina Valdes');
INSERT INTO `departamentos` VALUES (4200,'MANTENIMIENTO','VALENCIA','Adriana Rocha');
INSERT INTO `departamentos` VALUES (4300,'MANTENIMIENTO','MADRID','German Luna');

-- Insertar datos en la tabla `empleados`

INSERT INTO `empleados` VALUES (222,'José Giraldo','M','1985-01-20','2000-11-01',1200000,400000,'Asesor',3500);
INSERT INTO `empleados` VALUES (333,'Pedro Blanco','M','1987-10-28','2000-10-01',800000,3000000,'Vendedor',2000);
INSERT INTO `empleados` VALUES (444,'Jesús Alfonso','M','1988-03-14','2000-10-01',800000,3500000,'Vendedor',2000);
INSERT INTO `empleados` VALUES (555,'Julián Mora','M','1989-07-03','2000-10-01',800000,3100000,'Vendedor',2200);
INSERT INTO `empleados` VALUES (666,'Manuel Millán','M','1990-12-08','2004-06-01',800000,3700000,'Vendedor',2300);
INSERT INTO `empleados` VALUES (777,'Marcos Cortez','M','1986-06-23','2000-04-16',2550000,500000,'Mecánico',4000);
INSERT INTO `empleados` VALUES (782,'Antonio Gil','M','1980-01-23','2010-04-16',850000,1500000,'Técnico',1500);
INSERT INTO `empleados` VALUES (219,'Melissa Roa','F','1960-06-19','2001-03-16',2250000,2500000,'Vendedor',2100);
INSERT INTO `empleados` VALUES (111,'Irene Díaz','F','1979-09-28','2004-06-01',1050000,200000,'Mecánico',4200);
INSERT INTO `empleados` VALUES (383,'Luis Pérez','M','1956-02-25','2000-01-01',5050000,0,'Director',1500);
INSERT INTO `empleados` VALUES (060,'Darío Casas','M','1960-04-05','1992-11-01',4500000,500000,'Investigador',3000);
INSERT INTO `empleados` VALUES (802,'William Daza','M','1982-10-09','1999-12-16',2250000,1000000,'Investigador',3000);
INSERT INTO `empleados` VALUES (221,'Carla López','F','1975-05-11','2005-07-16',4500000,500000,'Jefe Mercadeo',3500);
INSERT INTO `empleados` VALUES (331,'Carlos Rozo','M','1975-05-11','2001-09-16',750000,500000,'Vigilante',3500);
INSERT INTO `empleados` VALUES (099,'Diana Solarte','F','1957-11-19','1990-05-16',1250000,500000,'Secretaria',1000);
INSERT INTO `empleados` VALUES (144,'Rosa Angulo','F','1957-03-15','1998-08-16',3250000,3500000,'Jefe Ventas',2000);
INSERT INTO `empleados` VALUES (269,'María Rojas','F','1959-01-15','1990-05-16',6250000,1500000,'Gerente',1000);
INSERT INTO `empleados` VALUES (343,'Elisa Rojas','F','1979-09-28','2004-06-01',3000000,1000000,'Jefe Mecánicos',4000);
INSERT INTO `empleados` VALUES (334,'Marisol Pulido','F','1979-10-01','1990-05-16',3250000,1000000,'Investigador',3000);
INSERT INTO `empleados` VALUES (335,'Ana Moreno','F','1992-01-05','2004-06-01',1200000,400000,'Secretaria',3000);
INSERT INTO `empleados` VALUES (336,'Carolina Ríos','F','1992-02-15','2000-10-01',1250000,500000,'Secretaria',1500);
INSERT INTO `empleados` VALUES (337,'Edith Muñoz','F','1992-03-31','2000-10-01',800000,3600000,'Vendedor',2100);
INSERT INTO `empleados` VALUES (338,'Abel Gómez','M','1939-12-24','2000-10-01',1050000,200000,'Mecánico',4300);
INSERT INTO `empleados` VALUES (689,'Mario Llano','M','1945-08-30','1990-05-16',2250000,2500000,'Vendedor',2300);
INSERT INTO `empleados` VALUES (785,'Joaquín Rosas','M','1947-07-07','1990-05-16',2250000,2500000,'Vendedor',2200);
INSERT INTO `empleados` VALUES (898,'Iván Duarte','M','1955-08-12','1998-05-16',1050000,200000,'Mecánico',4100);

#0. Obtener los datos completos de los departamentos.
select * from departamentos;
#1. Obtener los datos completos de los empleados.
select * from empleados;
#2. Listar el nombre de los departamentos.
select id_depto,nombre_depto from departamentos order by id_depto asc;
#3. Obtener el nombre y salario de todos los empleados.
select nombre,sal_emp from empleados;
#4. Listar todas las comisiones.
select id_emp,nombre,comision_emp from empleados order by comision_emp asc;
#5. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
select * from empleados where cargo_emp = "secretaria";
#6. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
select * from empleados where cargo_emp = "vendedor" order by nombre asc;
#7. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
select nombre,cargo_emp from empleados order by sal_emp asc;
#8. Obtener el nombre de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”
select nombre_jefe_depto from departamentos where ciudad = "ciudad real";
#9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
select nombre as Nombre_Empleado, cargo_emp as Cargo_Empleado from empleados;
#10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
select nombre,sal_emp,comision_emp from empleados where id_depto = 2000 order by  comision_emp asc;
/*11. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de:
sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
empleado y el total a pagar, en orden alfabético.*/
select nombre, (sal_emp + comision_emp + 500) as pago_total from empleados where id_depto = 3000 order by nombre asc;
#12. Muestra los empleados cuyo nombre empiece con la letra J.
select * from empleados where nombre like "j%";
#13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.
select nombre,comision_emp as comision ,(sal_emp + comision_emp) as salario_total from empleados where comision_emp > 1000;
#14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
select nombre,comision_emp as comision,(sal_emp + comision_emp) as salario_total from empleados where comision_emp = 0;
#15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
select * from empleados where  comision_emp > sal_emp;
#16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.}
select * from empleados where comision_emp <= (sal_emp * 0.3);
#17. Hallar los empleados cuyo nombre no contiene la cadena “MA”
select * from empleados where nombre not like "%ma%";
#18. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento.
select nombre_depto from departamentos where nombre_depto in ("Ventas","Investigación","Mantenimiento");
select nombre_depto from departamentos where nombre_depto = "ventas" or nombre_depto = "investigacion" or nombre_depto = "mantenimiento";
#19. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.
select nombre_depto from departamentos where nombre_depto not in ("Ventas","Investigación","Mantenimiento");
#20. Mostrar el salario más alto de la empresa.
select max(sal_emp) from empleados;
#21. Mostrar el nombre del último empleado de la lista por orden alfabético.
select nombre from empleados where nombre = (select max(nombre) from empleados);
#22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
select max(sal_emp),min(sal_emp),(max(sal_emp)-min(sal_emp)) as diferencia from empleados;
#23. Hallar el salario promedio por departamento.
select nombre_depto,round(avg(sal_emp)) as salario_promedio from departamentos inner join empleados on departamentos.id_depto = empleados.id_depto group by nombre_depto;
#24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
select nombre_depto,count(nombre_depto) as cantidad from departamentos inner join empleados
on departamentos.id_depto = empleados.id_depto group by nombre_depto having count(nombre_depto) > 3;
#25. Hallar los departamentos que no tienen empleados
select nombre_depto,count(nombre_depto) as cantidad from departamentos inner join empleados on departamentos.id_depto = empleados.id_depto group by nombre_depto having count(nombre_depto) = 0;
#26. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada departamento.
select nombre,nombre_depto,nombre_jefe_depto from empleados right join departamentos on empleados.id_depto = departamentos.id_depto;
#27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
select * from empleados where sal_emp >= (select avg(sal_emp) from empleados) order by cargo_emp asc;


use personal;
select * from departamentos;
select * from empleados;
