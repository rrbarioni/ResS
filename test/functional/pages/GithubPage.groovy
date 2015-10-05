package pages

import geb.Page

class GithubPage extends Page {

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 9963147504843f021cbd0de6022fbec879b71213
    def titulo = "pauloborba/ResS · GitHub"
=======
    def titulo = "pauloborba/ResS ï¿½ GitHub"
>>>>>>> f63c9b597206b06a5b21a6df189a493a26262c1a
    static url = "https://github.com/pauloborba/ResS"

    static at = {
        title ==~ titulo
    }
}
