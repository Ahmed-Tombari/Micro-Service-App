# **Architecture Microservices avec Spring Cloud**

Ce projet illustre la création et le déploiement de plusieurs microservices dans une architecture basée sur **Spring Cloud**.

---

## **Fonctionnalités et étapes principales**

### 1. **Customer-Service**
- Création de l'entité **Customer** et de l'interface `CustomerRepository` avec **Spring Data**.
- Développement de l'API RESTful.
- Tests fonctionnels.

### 2. **Inventory-Service**
- Création de l'entité **Product** et de l'interface `ProductRepository`.
- Développement de l'API RESTful.
- Tests fonctionnels.

### 3. **Gateway Service**
- Mise en place d'un service de passerelle avec **Spring Cloud Gateway**.
- Accès aux services via des endpoints unifiés (par exemple, http://localhost:7777/customer-service/api/customers).

### 4. **Registry Service**
- Mise en place d'un annuaire à l'aide de **Netflix Eureka** pour la découverte des services.
- Accès à l'annuaire des services : http://localhost:8761/eureka.

### 5. **Proxy Dynamique**
- Implémentation d'un proxy dynamique permettant de gérer les routes des microservices enregistrés dans Eureka.

### 6. **Billing-Service**
- Création d'un service de facturation (**Billing-Service**) utilisant **Open Feign** pour interagir avec **Customer-Service** et **Inventory-Service**.

### 7. **Service de Configuration**
- Développement d'un microservice dédié à la centralisation et la gestion des configurations.

---

## **Architecture des Microservices avec Spring Cloud Gateway**

![gateway architecture](https://github.com/user-attachments/assets/1128ab6f-1a37-4086-8774-a4c2ba4e3e91)


---

## **Modèle de base de données**

![database entites](https://github.com/user-attachments/assets/d79f2a4c-69aa-49d7-9463-a4563b932be1)

---

## **Stack Technique Utilisée**

- **Backend** : Maven, Java 21, Spring Boot, Spring Cloud (Gateway, Config Server, Eureka), Spring Data JPA, Spring Data REST, Open Feign.
- **Base de données** : H2 Database, Postgresql.
- **Communication interservices** : REST API, Open Feign.
- **Outils de développement** : IntelliJ IDEA, Maven.
- **Gestion des configurations** : Spring Cloud Config Server.
- **Découverte des services** : Netflix Eureka.

## **Configurer le dépôt de configuration Remote**
**Créer un nouveau dépôt et initialiser les propriétés de configuration** :
 ```bash
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Ahmed-Tombari/config-microservice-app.git
git push -u origin main

---

## **Comment Exécuter le Projet**

1. **Cloner le dépôt** :
   ```bash
   git clone

2. **Configurer la base de données** :
   Mettre à jour les propriétés de la base de données dans le fichier application.yml

3. **Démarrer les services dans cet ordre** :
   1 - discovery-service (Eureka Registry)
   2 - config-service (Configuration centralisée)
   3 - customer-service
   4 - inventory-service
   5 - billing-service
   6 - gateway-service

4. **Accéder aux services** :
   - Eureka Client : http://localhost:8761/eureka pour voir les services en cours d'exécution.
   - APIs via Gateway : Utilisez les routes configurées comme http://localhost:7777/customer-service/api/customers.
