# Addresses Book [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

<img src="https://image.flaticon.com/icons/svg/148/148988.svg" title="AddressesBook" alt="AddressesBook" align="right" width="128">

### An application to manage your Addresses by: 
###  Import a CSV File 
###  Posting an Address with a form
###  Manage stored addresses
###  More features coming soon ...

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring](https://spring.io/) - Java Framework
* [Bulma](https://bulma.io/documentation/) - CSS Framework
* [JPA Hibernate](https://hibernate.org/orm/documentation/5.4/) - Database persistence
* [Vanilla JS](https://developer.mozilla.org/en-US/docs/Web/JavaScript) - No external Framework JS

## Getting Started

> These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 
### Prerequisites
```
Maven (Optional)
SQL Workbench (or equivalent)
IDEA configured with : 
  - Maven
  - Spring
JDK 1.8 (min)
Your favorite internet browser
```

### Installing
```
cd ./yourWorkspace/
git cone https://github.com/louiiuol/AddressesBook.git
cd AddressesBook
mvn update
mvn spring-boot:run
cd AddressesBook/AddressBook-Front/
open index.html (depending on your favorite way to open html files)
```

## Versioning (How To Git) 
> Follow steps in the following order

### WHEN you get the project from github
> Clone project in your workspace
```
cd ./yourWorkspace/
git cone https://github.com/louiiuol/AddressesBook.git
```
###### You can now start working on the project, implementing functionnalities, fixing bugs and such ...
##
### WHEN you contributing to the project (alone)
> Every new functionnality implemented, check if the project is stable, 
> then you can certify that your changes works as follow:
```
git add . // Only if you have configure your .gitignore (otherwise: git add path/yourfile.extension)
git commit -m "#id - Short and precise description of functionnality"
```
##
### WHEN you want to publish your changes:
> Update your knowledge of the distant repository informations (commits, branches etc..)
```
git fetch
```
> Show differences between your local repository and the distant one 
```
git status
```
#### Depending on the result of the command ```git status``` above, following commands are required: 
> " Your branch is ahead from * commits to master "
```
git push
```
> " Your branch is behind from * commits to master "
```
git pull
```
##
> " **_Your branch and 'origin/master' have diverged,and have * and * different commits each, respectively._** "
```
git pull
git status
```
#### Depending on the result of the command ```git status``` above, following commands are required: 
##
```
> " Automatic merge made with success "
```
###### Your commits are published, you can now certify that your changes works as follow:(Only if you have configure your .gitignore)
```
git add . 
git commit 
```
##
```
> " CONFLICT (content): Merge conflict in file.extension " 
```
###### You need to fix merging issues on the(s) file(s)
##
### WHEN you want to fix merging issues
```
cd pathToFileWithMerginIssue/
open FileWithMerginIssue.extension
```
#### Example of merging issue in editor: 
> The HEAD part represent the text from your local repository
> The other part, after the ======= separation, represent the text on the distant respository
```
<<<<<<< HEAD
This Text shouldnt be here, it's my cat who wrote that, i swear !!
=======
## HEADLINE
This is the text i want to keep 
>>>>>>> 343734534635
```
> Simply choose wich part you want to keep, and delete the other, as follow: 
```
## HEADLINE
This is the text i want to keep 
```
> Save your file 

##### you can now certify that your changes works as follow:(Only if you have configure your .gitignore)
```
git add . 
git commit 
```
##
### WHEN you start a new GIT issue
> Create your branch
```
git branch #id-branchName
git checkout branchName (may be optional)
```
> Once your changes are certified on your branch (as above), u can merge them 
```
git checkout master 
git merge #id-branchName
```
> Clean your repository from useless branch
```
git branch // List all branch 
git branch -d branchName
```

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
