import play.jobs._
import play.test._

import models._

@OnApplicationStart class Bootstrap extends Job {

    override def doJob {
        if (Contact.count == 0) Fixtures load "data.yml"
    }

}