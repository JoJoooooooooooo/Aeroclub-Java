/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  joey.hossaert
 * Created: 1 mars 2023
 */

/* Ajout de 3 nouveaux badges pour la secrétaire, le trésorier et le président */

INSERT INTO badge (badge) VALUES ('111');
INSERT INTO badge (badge) VALUES ('112');
INSERT INTO badge (badge) VALUES ('113');

/* Ajout des comptes de la secrétaire, du trésorier et du président */
INSERT INTO membres (nummembres, nom, prenom, adresse, codepostal, ville, tel, fax, email, numbadge, numqualif, profession, lieunaissance, datenaissance, password)
VALUES (1, 'Médine', 'Candyleine', 'JB', 59140, 'Dunkerque', '0754823654', '0325465856', 'secre@gmail.com', '111', 1, 'secrétaire', 'Dunkerque', CURRENT_DATE, '$2y$10$gcFJ6AEZhAbG2HJe8xPml.CiW9XlWLT38.xZNzZaVM3ndiivCW/.O'),
(4, 'Mbappe', 'Kylian', 'JB', 59140, 'Dunkerque', '0653264584', '0325465856', 'treso@gmail.com', '112', 4, 'trésorier', 'Dunkerque', CURRENT_DATE, '$2y$10$gcFJ6AEZhAbG2HJe8xPml.CiW9XlWLT38.xZNzZaVM3ndiivCW/.O'),
(5, 'Deschamps', 'Didier', 'JB', 59140, 'Dunkerque', '0215425365', '0325465856', 'presi@gmail.com', '113', 5, 'président', 'Dunkerque', CURRENT_DATE, '$2y$10$gcFJ6AEZhAbG2HJe8xPml.CiW9XlWLT38.xZNzZaVM3ndiivCW/.O'); 
