# Micro-Service-App
- création et de déploiement de plusieurs microservices dans une architecture basée sur Spring. Voici un résumé des étapes :

1. *Microservice Customer-service* : Création de l'entité Customer et de l'interface CustomerRepository avec Spring Data, suivi du déploiement de l'API Restful et des tests.

2. *Microservice Inventory-service* : Création de l'entité Product et de l'interface ProductRepository, déploiement de l'API Restful et tests.

3. *Gateway Service* : Création d'un service de passerelle avec Spring Cloud Gateway, en testant d'abord avec une configuration statique via un fichier application.yml, puis avec une configuration Java.

4. *Registry Service* : Mise en place d'un annuaire avec le serveur Netflix Eureka.

5. *Proxy dynamique* : Test du proxy avec une gestion dynamique des routes vers les microservices enregistrés sur Eureka.

6. *Billing-Service* : Création d'un service de facturation utilisant Open Feign pour interagir avec les services Customer-service et Inventory-service.

7. *Service de configuration* : Création d'un service dédié à la configuration.

MicroServiceApp
![database entites](https://github.com/user-attachments/assets/f64cca0b-dae8-4c27-a721-5f4d43ec099c)
![Architecture gateway](https://github.com/user-attachments/assets/3102ab70-390a-4de8-adca-f6d777baf6f3)

