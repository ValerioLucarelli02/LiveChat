DROP DATABASE IF EXISTS Imessage ;
 Create Database Imessage;
 USE Imessage;
 
 
 Create Table Utente (
	utenteID INTEGER PRIMARY KEY AUTO_INCREMENT,
    us_na VARCHAR (25) NOT NULL UNIQUE,
    emai VARCHAR(250) NOT NULL,
    pass VARCHAR(250) NOT NULL,
    is_admin BOOLEAN DEFAULT FALSE
    );
    
    Create Table Messaggio(
    messaggioID INTEGER PRIMARY KEY AUTO_INCREMENT,
    ms_in DATETIME DEFAULT CURRENT_TIMESTAMP,
    ms_te VARCHAR (250) NOT NULL,
    UtenteRIF INTEGER,
    FOREIGN KEY (UtenteRIF) REFERENCES UTENTE(utenteID));
    
     INSERT INTO Utente (us_na,emai,pass,is_admin) VALUES
	("Valerio","valerio@gmail.com","11234",1);
    
    INSERT INTO Messaggio (ms_te) VALUES
    ("CIAOCIAOCIAOCIOA");
    
    
	SELECT * FROM Messaggio
    
    
    
    
 