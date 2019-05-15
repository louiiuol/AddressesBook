# Addresses Book
<img src="https://image.flaticon.com/icons/svg/148/148988.svg" title="AddressesBook" alt="AddressesBook" align="right">

An application to manage your Addresses by: 
* Import a CSV File 
* Posting an Address with a form
* More features coming soon ...

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring](https://spring.io/) - Java Framework
* [Bulma](https://bulma.io/documentation/) - CSS Framework
* [Vanilla JS](https://developer.mozilla.org/en-US/docs/Web/JavaScript)

### Prerequisites

What things you need to install the software and how to install them

```
Maven
Spring
SQL Workbench
JDK 1.8 
```

### Installing

A step by step series that tell you how to get the development env running

```
cd ./yourWorkspace/
git cone https://github.com/louiiuol/AddressesBook.git
cd AddressesBook
mvn update
mvn spring-boot:run
```

## Running the tests

Tests are not implemented yet!



## Versioning (How To Git)

### First time working on the project
#### Clone project in your workspace
```
cd ./yourWorkspace/
git cone https://github.com/louiiuol/AddressesBook.git
```
###### You can now start working on the project, implementing functionnalities.. 

### Every time you add a new functionnality, and the project is stable, you can certify your changes work as follow:
```
git add . // Only if you have configure your .gitignore
or
git add path/yourfile.extension
```

#### Once you add all the files you wish to publish 
```
git commit -m "#id - Short and precise description of functionnality"
```
#### You can also do it in one line (Only if you have configure your .gitignore)
```
git commit -am "#id - Short and precise description of functionnality"
```

### Once you have made changes to the project and commit them, you can start to deploy your changes:
#### Update your knowledge of distant repository (commits, branch etc..)
```
git fetch
```
#### Show differences between your local repository and the distant one 
```
git status
```

### Depending on the result of the cmd git status above, following commands are required: 
#### Your branch is ahead from * commits to master
```
git push
```
#### Your branch is behind from * commits to master
```
git pull
```
#### Your branch and master have diverged
```
git commit -am "#id - Short and precise description of functionnality" // Only if you have configure your .gitignore
git pull
git status
```

### Depending on the result of the cmd git status above, following commands are required: 


## Authors

* **Louis Godlewski**  - [louiiuol](https://github.com/louiiuol)
* **Nathalie Robert**  - [nathalieRobert](https://github.com/nathalieRobert)
* **Jonathan Luminuku**  - [LuminukuJ](https://github.com/LuminukuJ)
* **Fox**  - [webyprod](https://github.com/webyprod)
* **Pascal Dennu**  - [PascalDennu](https://github.com/PascalDennu)
* **Anne-Sophie Jehu**  - [MissRazmoket](https://github.com/MissRazmoket)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/louiiuol/f1ca9436c877c85f39f20e683ed64156) for details on our code of conduct, and the process for submitting pull requests to us.
