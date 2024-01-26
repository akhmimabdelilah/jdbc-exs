
--
-- Structure de la table `DevData`
--

CREATE TABLE `DevData` (
  `Developpeur` varchar(32),
  `Jour` CHAR(11),
  `NbScripts` INTEGER
);

--
-- Déchargement des données de la table `client`
--

INSERT INTO `DevData` VALUES('ALAMI', 'Lundi', 1);
INSERT INTO `DevData` VALUES('WAFI', 'Mardi', 2);
INSERT INTO `DevData` VALUES('SLAMI', 'Jeudi', 1);

