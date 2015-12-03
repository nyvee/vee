package scorex.lagonaki

import org.scalatest.{BeforeAndAfterAll, Suites}
import scorex.lagonaki.integration.{BlockGeneratorSpecification, BlocksRoutingSpecification, ValidChainGenerationSpecification}
import scorex.lagonaki.unit._

class LagonakiTestSuite extends Suites(
  //unit tests
  new MessageSpecification
  , new BlockSpecification
  , new BlockchainStorageSpecification
  , new WalletSpecification
  , new BlockGeneratorSpecification
  , new BlocksRoutingSpecification

  //integration tests - slow!
  , new ValidChainGenerationSpecification

) with BeforeAndAfterAll {

  override def beforeAll() = {}

  override def afterAll() = {}
}
