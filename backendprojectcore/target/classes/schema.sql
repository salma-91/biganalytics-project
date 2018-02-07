--
-- Drop table if exists `ClientDetails`
--
DROP TABLE IF EXISTS `ClientDetails`;
--
-- Drop table if exists `user`
--


--
-- Drop table if exists `trader_location`
--

--
-- Drop table if exists `trader`
--
--
-- Drop table if exists `intermediate_center`
--


--
-- DROP table if exists `oauth_access_token`
--
DROP TABLE IF EXISTS `oauth_access_token`;
--
-- DROP table if exists `oauth_approvals`
--
DROP TABLE IF EXISTS `oauth_approvals`;
--
-- DROP table if exists `oauth_client_details`
--
DROP TABLE IF EXISTS `oauth_client_details`;
--
-- DROP table if exists `oauth_client_token`
--
DROP TABLE IF EXISTS `oauth_client_token`;
--
-- DROP table if exists `oauth_code`
--
DROP TABLE IF EXISTS `oauth_code`;
--
-- DROP table if exists `oauth_refresh_token`
--
DROP TABLE IF EXISTS `oauth_refresh_token`;
DROP TABLE IF EXISTS `trader_location`;
DROP TABLE IF EXISTS `intermediate_center`;
DROP TABLE IF EXISTS `trader`;
DROP TABLE IF EXISTS `user`;
--
-- Create table `ClientDetails`
--
CREATE TABLE `ClientDetails` (
  `appId` varchar(255) NOT NULL,
  `resourceIds` varchar(255) DEFAULT NULL,
  `appSecret` varchar(255) DEFAULT NULL,
  `scope` varchar(255) DEFAULT NULL,
  `grantTypes` varchar(255) DEFAULT NULL,
  `redirectUrl` varchar(255) DEFAULT NULL,
  `authorities` varchar(255) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` int(11) DEFAULT NULL,
  `additionalInformation` varchar(4096) DEFAULT NULL,
  `autoApproveScopes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`appId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `ClientDetails`
--
LOCK TABLES `ClientDetails` WRITE;
UNLOCK TABLES;

--
-- Create table `user`
--
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `contact_number` varchar(15) DEFAULT NULL,
  `alternate_contact_number` varchar(15) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city_code` varchar(20) DEFAULT NULL,
  `state_code` varchar(20) DEFAULT NULL,
  `country_code` varchar(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `role` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
--
-- Dumping data for table `user`
--
LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (25,'aiyana@gmail.com','book','Aiyana Shukla',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-08 11:57:42','2017-08-08 11:57:42',1),(26,'anisha@gmail.com','book','Anisha Shukla',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-08 11:58:02','2017-08-08 11:58:02',0);
UNLOCK TABLES;

--
-- Create table `trader`
--
CREATE TABLE `trader` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `speciality_code` varchar(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
--
-- Dumping data for table `trader`
--
LOCK TABLES `trader` WRITE;
INSERT INTO `trader` VALUES (10,'abc123','2017-08-08 12:02:06','2017-08-08 12:02:06',25);
UNLOCK TABLES;

--
-- Create table `intermediate_center`
--
CREATE TABLE `intermediate_center` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `city_code` varchar(20) NOT NULL,
  `state_code` varchar(20) NOT NULL,
  `country_code` varchar(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
--
-- Dumping data for table `intermediate_center`
--

LOCK TABLES `intermediate_center` WRITE;
UNLOCK TABLES;

--
-- Create table `trader_location`
--
CREATE TABLE `trader_location` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `trader_id` bigint(20) NOT NULL,
  `address_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `trader_location_id_fk` (`trader_id`),
  KEY `address_id_fk` (`address_id`),
  CONSTRAINT `address_id_fk` FOREIGN KEY (`address_id`) REFERENCES `intermediate_center` (`id`),
  CONSTRAINT `trader_location_id_fk` FOREIGN KEY (`trader_id`) REFERENCES `trader` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
--
-- Dumping data for table `trader_location`
--
LOCK TABLES `trader_location` WRITE;
UNLOCK TABLES;

--
-- Create table `oauth_access_token`
--
CREATE TABLE `oauth_access_token` (
  `token_id` varchar(255) DEFAULT NULL,
  `token` mediumblob,
  `authentication_id` varchar(255) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `client_id` varchar(255) DEFAULT NULL,
  `authentication` mediumblob,
  `refresh_token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`authentication_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `oauth_access_token`
--
LOCK TABLES `oauth_access_token` WRITE;
UNLOCK TABLES;

--
-- Create table `oauth_access_token`
--
CREATE TABLE `oauth_approvals` (
  `userId` varchar(255) DEFAULT NULL,
  `clientId` varchar(255) DEFAULT NULL,
  `scope` varchar(255) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `expiresAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lastModifiedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `oauth_approvals`
--
LOCK TABLES `oauth_approvals` WRITE;
UNLOCK TABLES;

--
-- Create table `oauth_client_details`
--
CREATE TABLE `oauth_client_details` (
  `client_id` varchar(255) NOT NULL,
  `resource_ids` varchar(255) DEFAULT NULL,
  `client_secret` varchar(255) DEFAULT NULL,
  `scope` varchar(255) DEFAULT NULL,
  `authorized_grant_types` varchar(255) DEFAULT NULL,
  `web_server_redirect_uri` varchar(255) DEFAULT NULL,
  `authorities` varchar(255) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` int(11) DEFAULT NULL,
  `additional_information` varchar(4096) DEFAULT NULL,
  `autoapprove` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `oauth_client_details`
--
LOCK TABLES `oauth_client_details` WRITE;
UNLOCK TABLES;

--
-- Create table `oauth_client_token`
--
CREATE TABLE `oauth_client_token` (
  `token_id` varchar(255) DEFAULT NULL,
  `token` mediumblob,
  `authentication_id` varchar(255) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `client_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`authentication_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `oauth_client_token`
--
LOCK TABLES `oauth_client_token` WRITE;
UNLOCK TABLES;

--
-- Create table `oauth_code`
--
CREATE TABLE `oauth_code` (
  `code` varchar(255) DEFAULT NULL,
  `authentication` mediumblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `oauth_code`
--
LOCK TABLES `oauth_code` WRITE;
UNLOCK TABLES;

--
-- Create table `oauth_refresh_token`
--
CREATE TABLE `oauth_refresh_token` (
  `token_id` varchar(255) DEFAULT NULL,
  `token` mediumblob,
  `authentication` mediumblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `oauth_refresh_token`
--
LOCK TABLES `oauth_refresh_token` WRITE;
UNLOCK TABLES;


