def call(Map config) {
  echo 'Call of Shared Library'
}

def call() {
  steps {
            script { 
                   echo 'Call of Shared Library paramater less'
            }
       }
}

