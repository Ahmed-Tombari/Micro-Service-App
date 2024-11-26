# Architecture Microservices avec Spring Cloud
Ce projet illustre la création et le déploiement de plusieurs microservices dans une architecture basée sur # Spring Cloud.

# Fonctionnalités et étapes principales

# 1. Customer-Service
Création de l'entité Customer et de l'interface CustomerRepository avec Spring Data.
Développement de l'API RESTful.
Tests fonctionnels.
# 2. Inventory-Service
Création de l'entité Product et de l'interface ProductRepository.
Développement de l'API RESTful.
Tests fonctionnels.
# 3. Gateway Service
Mise en place d'un service de passerelle avec Spring Cloud Gateway.
Tests avec une configuration statique via application.yml, puis en utilisant une configuration Java.
# 4. Registry Service
Mise en place d'un annuaire à l'aide de Netflix Eureka pour la découverte des services.
5. Proxy Dynamique
Implémentation d'un proxy dynamique permettant de gérer les routes des microservices enregistrés dans Eureka.
# 6. Billing-Service
Création d'un service de facturation (Billing-Service) utilisant Open Feign pour interagir avec Customer-Service et Inventory-Service.
# 7. Service de Configuration
Développement d'un microservice dédié à la centralisation et la gestion des configurations.

# Architecture des Microservices avec Spring Cloud Gateway
![Architecture gateway](https://github.com/user-attachments/assets/ff036158-5459-461e-8f16-1549c5453d92)
# Modèle de base de données
![database entites](https://github.com/user-attachments/assets/549daf4c-60d9-4f92-8092-571ac317086d)

# Stack Technique Utilisée
Backend : Spring Boot, Spring Cloud (Gateway, Config Server, Eureka), Spring Data JPA, Open Feign.
Base de données : MySQL.
Communication interservices : REST API, Open Feign.
Outils de développement : IntelliJ IDEA, Maven.
Gestion des configurations : Spring Cloud Config Server.
Découverte des services : Netflix Eureka.

# Comment Exécuter le Projet
Cloner le dépôt :

git clone https://github.com/username/repo.git
Configurer la base de données :
Mettre à jour les propriétés de la base de données dans le fichier application.yml.

Démarrer les services :
Lancer chaque service individuellement depuis un IDE ou via Maven :

mvn spring-boot:run
Tester les endpoints :
Utilisez Postman ou Swagger UI pour interagir avec les services.



