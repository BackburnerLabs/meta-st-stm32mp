SUMMARY = "Provides Device Tree files for STM32MP boards"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

EXTDTB_SRC_URI ?= "git://github.com/BackburnerLabs/dt-stm32mp.git;protocol=https;branch=savers-v6-stm32mp"
SRC_URI = "${EXTDTB_SRC_URI}"
SRCREV = "ee20a7cbcd29497b2c2e67ff3e1c4419df875d4e"

S = "${WORKDIR}/git"

EXT_DT_VERSION = "v6.0"
EXT_DT_RELEASE = "stm32mp-r3"

COMPATIBLE_MACHINE = "(stm32mpcommon)"

require external-dt-common.inc

# ---------------------------------
# Configure archiver use
# ---------------------------------
include ${@oe.utils.ifelse(d.getVar('ST_ARCHIVER_ENABLE') == '1', 'external-dt-archiver.inc','')}
