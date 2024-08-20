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

# Build errors
If you get a build error like the following, you have to rebuild the kernel.

***ERROR: kernel-module-datra-1.1+AUTOINC+05df67a916-r0 do_make_scripts: Function failed: do_make_scripts (log file is located at /home/topic/my-platform/build/tmp-glibc/work/topic_miami_florida_gen-oe-linux-gnueabi/kernel-module-datra/1.1+AUTOINC+05df67a916-r0/temp/log.do_make_scripts.107306)***

Clean the kernel:
````
cd ~/my-platform/build
source profile
bitbake -c cleansstate virtual/kernel
````
After this, build your image again.
