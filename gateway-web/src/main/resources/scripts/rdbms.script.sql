DROP TABLE IF EXISTS oauth_client_details;

CREATE TABLE oauth_client_details (
  client_id varchar(256) NOT NULL,
  resource_ids varchar(256) DEFAULT NULL,
  client_secret varchar(256) DEFAULT NULL,
  scope varchar(256) DEFAULT NULL,
  authorized_grant_types varchar(256) DEFAULT NULL,
  web_server_redirect_uri varchar(256) DEFAULT NULL,
  authorities varchar(256) DEFAULT NULL,
  access_token_validity int(11) DEFAULT NULL,
  refresh_token_validity int(11) DEFAULT NULL,
  additional_information varchar(4096) DEFAULT NULL,
  autoapprove varchar(4096) DEFAULT NULL,
  PRIMARY KEY (client_id)
);


INSERT INTO `oauth_client_details` VALUES ('7b5a38705d7b3562655925406a652e32','','7019fb3e090c10c7b2e12fb3c6702b08e9d6cd65edb94ae5fb76aa12854edf64be3b82a17a4cebb6','password','password,refresh_token','','',1209600,1209600,'{\"info\":\"\"}','');

  DROP TABLE IF EXISTS oauth_access_token;

  CREATE TABLE oauth_access_token (
  token_id varchar(256) DEFAULT NULL,
  token blob,
  authentication_id varchar(256) DEFAULT NULL,
  user_name varchar(256) DEFAULT NULL,
  client_id varchar(256) DEFAULT NULL,
  authentication blob,
  refresh_token varchar(256) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS oauth_refresh_token;

CREATE TABLE oauth_refresh_token (
  token_id varchar(256) DEFAULT NULL,
  token blob,
  authentication blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;