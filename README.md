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
- Tests avec une configuration statique via `application.yml`, puis en utilisant une configuration Java.

### 4. **Registry Service**
- Mise en place d'un annuaire à l'aide de **Netflix Eureka** pour la découverte des services.

### 5. **Proxy Dynamique**
- Implémentation d'un proxy dynamique permettant de gérer les routes des microservices enregistrés dans Eureka.

### 6. **Billing-Service**
- Création d'un service de facturation (**Billing-Service**) utilisant **Open Feign** pour interagir avec **Customer-Service** et **Inventory-Service**.

### 7. **Service de Configuration**
- Développement d'un microservice dédié à la centralisation et la gestion des configurations.

---

## **Architecture des Microservices avec Spring Cloud Gateway**

![Architecture gateway](https://github.com/user-attachments/assets/392ecefb-4fd7-485b-8065-14605ef9a136)

---

## **Modèle de base de données**

![database entites](https://github.com/user-attachments/assets/d79f2a4c-69aa-49d7-9463-a4563b932be1)

---

## **Stack Technique Utilisée**

- **Backend** : Spring Boot, Spring Cloud (Gateway, Config Server, Eureka), Spring Data JPA, Open Feign.
- **Base de données** : MySQL.
- **Communication interservices** : REST API, Open Feign.
- **Outils de développement** : IntelliJ IDEA, Maven.
- **Gestion des configurations** : Spring Cloud Config Server.
- **Découverte des services** : Netflix Eureka.

---

## **Comment Exécuter le Projet**

1. **Cloner le dépôt** :
   ```bash
   git clone

2. **Configurer la base de données** :
   Mettre à jour les propriétés de la base de données dans le fichier application.yml

3. **Démarrer les services** :
   ```bash
   mvn spring-boot:run
