@NonCPS
def call() {
  return Jenkins.get().getNodes().findAll { it.toComputer().isOnline() && it.toComputer().countBusy()==0 }.collectEntries { [ (it.selfLabel.name): it.numExecutors ] }
}
