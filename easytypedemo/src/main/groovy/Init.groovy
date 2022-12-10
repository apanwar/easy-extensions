import com.sap.cx.boosters.easy.extension.easytypedemo.model.EasyItemModel
import org.slf4j.LoggerFactory

def LOG = LoggerFactory.getLogger("easytypedemo")

def easyTypesRegistry = spring.getBean("easyTypesRegistry")

easyTypesRegistry.registerClass("com.sap.cx.boosters.easy.extension.easytypedemo.model.EasyItemModel", EasyItemModel.class)

LOG.info("Init completed for easytype demo")