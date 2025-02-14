meta-datra
==========

OpenEmbedded/Yocto overlay adding Datra driver, library and utilities

To add this layer to your OE environment, clone this repository into your layers directory (e.g. "my-zynq" if you've followed the README of meta-topic) and add it to the BBLAYERS variable in build/conf/bblayers.conf. It should have a BBLAYERS that looks like this:

````
BBLAYERS = " \
  ...
  Existing BBLAYER paths
  ...
  ${LAYERTOPDIR}/meta-datra \
  "
````

