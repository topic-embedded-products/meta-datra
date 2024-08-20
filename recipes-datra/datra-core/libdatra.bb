DESCRIPTION = "Library for Datra configuration"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRCREV = "ac740f79607116e53e57fd68d7530205b99c8cbb"

inherit autotools gitpkgv

PV = "2+${SRCPV}"
PKGV = "2+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN};protocol=https;branch=master"

PACKAGES =+ "${PN}-test ${PN}-demo ${PN}sw-dev ${PN}sw"
FILES:${PN}-test = "${bindir}/test*"
FILES:${PN}-demo = "${bindir}/datrademo*"

# Split the software library into its own package
FILES:${PN}sw-dev = "${libdir}/${PN}sw.so \
                     ${libdir}/pkgconfig/${PN}sw.pc \
                     ${includedir}/datra/filequeue.hpp \
                     ${includedir}/datra/*scheduler.hpp \
                     ${includedir}/datra/*process.hpp \
                     "
FILES:${PN}sw = "${libdir}/${PN}sw.so*"
