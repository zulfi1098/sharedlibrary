def call() {
    stage {
    
        def allModules = ['module1', 'module2', 'module3', 'module4', 'module5']
        def builders = [:]
          allModules.each() {
                builders[it] = {
                                    stage(it){
                                             script { 
                                                        echo 'Call of Shared Library paramater less'
                                                    }
                                    }
                                }
                                  
                               
          }
           parallel builders
    }
}

def call1() {
    stage {
    
    def allModules = ['module1', 'module2', 'module3', 'module4', 'module5']
    def builders = [:]
          allModules.each() {
            builders[it] = {
                                stage(it){
                                         script { 
                                                    echo 'Call of Shared Library paramater less'
                                                }
                                }
                            }
                                  
                           
          }
           parallel builders
      }
}
