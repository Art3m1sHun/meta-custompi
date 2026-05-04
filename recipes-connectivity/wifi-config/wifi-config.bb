SUMMARY = "WiFi auto config"
DESCRIPTION = "Install wpa_supplicant.conf for automatic WiFi connection"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://wpa_supplicant.conf"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/wpa_supplicant
    install -m 600 ${WORKDIR}/wpa_supplicant.conf \
        ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant.conf
}

FILES:${PN} += "${sysconfdir}/wpa_supplicant/wpa_supplicant.conf"