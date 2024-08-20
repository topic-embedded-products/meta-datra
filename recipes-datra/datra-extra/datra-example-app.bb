DESCRIPTION = "Commandline example application for DATRA."
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"
DEPENDS = "libdatra"

inherit autotools pkgconfig gitpkgv

PV = "0+${SRCPV}"
PKGV = "0+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN};protocol=https;branch=master"

SRCREV = "4186ff938cc1ab40758dac5c532418fd4e353ced"
