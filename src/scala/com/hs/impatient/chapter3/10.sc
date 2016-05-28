/**
 * Created by hs on 14-4-8.
 */
import java.awt.datatransfer._
val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
val result =flavors.getNativesForFlavor(DataFlavor.imageFlavor)