
Boot From: (USB)EMMC(SD) 8Bit DS
SYS_CONFIG: 0x205c8423, POC: 001
Cortex freq: 864000000
iDSP freq: 432000000
Dram freq: 420000000
Core freq: 720000000
AHB freq: 360000000
APB freq: 180000000
Entered USB download mode (2)...
init_usb_dev done
init_usb_hardware done
entering usb_task
Start to send data 16 bytes...
Send completed!
entering usb_task
start to recv data, crc=0x3ef865da
total rcv data length = 4152 bytes, crc32 = 0x3ef865da
entering usb_task
start to recv data, crc=0xac24c331
total rcv data length = 12 bytes, crc32 = 0xac24c331
entering usb_task
start to recv data, crc=0x2144df1c
total rcv data length = 4 bytes, crc32 = 0x2144df1c
entering usb_task
start to recv data, crc=0x45392e0e
total rcv data length = 16 bytes, crc32 = 0x45392e0e
entering usb_task
start to recv data, crc=0xf597bda8
|total rcv data length = 918032 bytes, crc32 = 0xf597bda8
Start to run...

NOTICE:  BL2: v2.1(release):fc60887-dirty
NOTICE:  BL2: Built : 12:17:27, Jan  3 2022
NOTICE:  ROTPK is not deployed on platform. Skipping ROTPK verification.
NOTICE:  BL2: Booting BL31

NOTICE:  BL31: Secure code at 0x100000
NOTICE:  BL31: Cleanup auto recovery request
NOTICE:  BL31: Non Secure code at 0x1400000
NOTICE:  BL31: v2.1(release):fc60887-dirty
NOTICE:  BL31: Built : 12:17:27, Jan  3 2022
NOTICE:  Stage2 Translation reserved 0xc00000

rmd image absent... skipping
Jumping to 0x01680000 ...
SOC signed DTB (RO).
SOC signed DTB (RO).
cpux_jump: 0x01400148
cmdline:
initrd2_start: 0x00000000 initrd2_size: 0x00000000
kernelp: 0x01600000 kernels: 0x7ea00000
iavp: 0x37800000 iavs: 0x48800000
fbp: 0x37800000 fbs: 0x00000000
dtbp: 0x37700000
[    0.000000] Booting Linux on physical CPU 0x0
[    0.000000] Linux version 4.14.183 (chewei.lin@rd1-5) (gcc version 8.2.1 20180802 (Linaro GCC 8.2-2018.08~dev)) #1 SMP PREEMPT Mon Jan 3 11:33:56 CST 2022
[    0.000000] Boot CPU: AArch64 Processor [410fd034]
[    0.000000] Machine model: Ambarella CV2BUB Board
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000034400000, size 48 MiB
[    0.000000] OF: reserved mem: initialized node linux,cma, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000037800000, size 644 MiB
[    0.000000] OF: reserved mem: initialized node iav@0x37800000, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000060000000, size 508 MiB
[    0.000000] OF: reserved mem: initialized node cavalry@0x60000000, compatible id shared-dma-pool
[    0.000000] psci: probing for conduit method from DT.
[    0.000000] psci: PSCIv1.1 detected in firmware.
[    0.000000] psci: Using standard PSCI v0.2 function IDs
[    0.000000] psci: Trusted OS migration not required
[    0.000000] psci: SMC Calling Convention v1.1
[    0.000000] percpu: Embedded 19 pages/cpu s38680 r8192 d30952 u77824
[    0.000000] Detected VIPT I-cache on CPU0
[    0.000000] CPU features: enabling workaround for ARM erratum 845719
[    0.000000] Speculative Store Bypass Disable mitigation not required
[    0.000000] Built 1 zonelists, mobility grouping on.  Total pages: 510552
[    0.000000] Kernel command line: console=ttyS0 root=/dev/ram0 ro rootfstype=squashfs initrd=0x2608000,40M ramdisk_size=320000 blkdevparts=mmcblk1:4G@0(linux),64M@0x100000(kernel0),64M@0x4100000(kernel1),240M@0x8100000(rootfs0),240M@0x17100000(rootfs1),8M@0x26100000(defconf0),8M@0x26900000(defconf1),32M@0x27100000(flashfs),2048M@0x29100000(flashfs2),1023M@0xA9100000(backup) user_debug=31
[    0.000000] PID hash table entries: 4096 (order: 3, 32768 bytes)
[    0.000000] Dentry cache hash table entries: 262144 (order: 9, 2097152 bytes)
[    0.000000] Inode-cache hash table entries: 131072 (order: 8, 1048576 bytes)
[    0.000000] Memory: 757064K/2074624K available (7998K kernel code, 630K rwdata, 2032K rodata, 384K init, 260K bss, 88760K reserved, 1228800K cma-reserved)
[    0.000000] Virtual kernel memory layout:
[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbebfff0000   (   250 GB)
[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008850000   (  8000 KB)
[    0.000000]     .rodata : 0xffffff8008850000 - 0xffffff8008a50000   (  2048 KB)
[    0.000000]       .init : 0xffffff8008a50000 - 0xffffff8008ab0000   (   384 KB)
[    0.000000]       .data : 0xffffff8008ab0000 - 0xffffff8008b4d808   (   631 KB)
[    0.000000]        .bss : 0xffffff8008b4d808 - 0xffffff8008b8e890   (   261 KB)
[    0.000000]     fixed   : 0xffffffbefe7fb000 - 0xffffffbefec00000   (  4116 KB)
[    0.000000]     PCI I/O : 0xffffffbefee00000 - 0xffffffbeffe00000   (    16 MB)
[    0.000000]     vmemmap : 0xffffffbf00000000 - 0xffffffc000000000   (     4 GB maximum)
[    0.000000]               0xffffffbf00058000 - 0xffffffbf02000000   (    31 MB actual)
[    0.000000]     memory  : 0xffffffc001600000 - 0xffffffc080000000   (  2026 MB)
[    0.000000] SLUB: HWalign=64, Order=0-3, MinObjects=0, CPUs=4, Nodes=1
[    0.000000] Preemptible hierarchical RCU implementation.
[    0.000000]  Tasks RCU enabled.
[    0.000000] NR_IRQS: 64, nr_irqs: 64, preallocated irqs: 0
[    0.000000] CPU features: GIC system register CPU interface present but disabled by higher exception level
[    0.000000] vco = 408000000, 24000000, 1, 17, 1
[    0.000000] vco = 384000000, 24000000, 1, 16, 1
[    0.000000] vco = 384000000, 24000000, 1, 16, 1
[    0.000000] vco = 1176000000, 24000000, 1, 49, 1
[    0.000000] vco = 1176000000, 24000000, 1, 49, 1
[    0.000000] arch_timer: cp15 timer(s) running at 63.00MHz (virt).
[    0.000000] clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0xe879c5e9b, max_idle_ns: 440795204668 ns
[    0.000004] sched_clock: 56 bits at 63MHz, resolution 15ns, wraps every 2199023255548ns
[    0.000198] Console: colour dummy device 80x25
[    0.373510] console [ttyS0] enabled
[    0.376988] Calibrating delay loop (skipped), value calculated using timer frequency.. 126.00 BogoMIPS (lpj=63000)
[    0.387310] pid_max: default: 32768 minimum: 301
[    0.391993] Mount-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.398684] Mountpoint-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.409850] ASID allocator initialised with 32768 entries
[    0.417248] Hierarchical SRCU implementation.
[    0.426624] smp: Bringing up secondary CPUs ...
[    0.438289] Detected VIPT I-cache on CPU1
[    0.442308] CPU1: Booted secondary processor [410fd034]
[    0.454341] Detected VIPT I-cache on CPU2
[    0.458345] CPU2: Booted secondary processor [410fd034]
[    0.470419] Detected VIPT I-cache on CPU3
[    0.474422] CPU3: Booted secondary processor [410fd034]
[    0.479681] smp: Brought up 1 node, 4 CPUs
[    0.483769] SMP: Total of 4 processors activated.
[    0.488456] CPU features: detected: 32-bit EL0 Support
[    0.494041] CPU: All CPU(s) started at EL1
[    0.498133] alternatives: patching kernel code
[    0.503561] devtmpfs: initialized
[    0.511451] random: get_random_u32 called from bucket_table_alloc+0x108/0x268 with crng_init=0
[    0.520350] clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 1911260446275000 ns
[    0.530073] futex hash table entries: 1024 (order: 5, 131072 bytes)
[    0.569268] xor: measuring software checksum speed
[    0.584102]    8regs     :  1996.000 MB/sec
[    0.598304]    8regs_prefetch:  1724.000 MB/sec
[    0.612848]    32regs    :  2288.000 MB/sec
[    0.627047]    32regs_prefetch:  1940.000 MB/sec
[    0.631644] xor: using function: 32regs (2288.000 MB/sec)
[    0.637026] pinctrl core: initialized pinctrl subsystem
[    0.642521] NET: Registered protocol family 16
[    0.647579] vdso: 2 pages (1 code @ ffffff8008855000, 1 data @ ffffff8008ab4000)
[    0.661693] DMA: preallocated 256 KiB pool for atomic allocations
[    0.670506] ambarella-pinctrl ec003000.pinctrl: Ambarella pinctrl driver registered
[    0.678763] ambarella-gpio ec003000.pinctrl:gpio@0: Ambarella GPIO driver registered
[    0.692446] HugeTLB registered 2.00 MiB page size, pre-allocated 0 pages
[    0.716364] raid6: int64x1  gen()   382 MB/s
[    0.737767] raid6: int64x1  xor()   380 MB/s
[    0.759193] raid6: int64x2  gen()   589 MB/s
[    0.780541] raid6: int64x2  xor()   503 MB/s
[    0.801881] raid6: int64x4  gen()   839 MB/s
[    0.823226] raid6: int64x4  xor()   619 MB/s
[    0.844571] raid6: int64x8  gen()   988 MB/s
[    0.865918] raid6: int64x8  xor()   638 MB/s
[    0.887265] raid6: neonx1   gen()   632 MB/s
[    0.908618] raid6: neonx1   xor()   740 MB/s
[    0.929989] raid6: neonx2   gen()   972 MB/s
[    0.951321] raid6: neonx2   xor()   988 MB/s
[    0.972664] raid6: neonx4   gen()  1285 MB/s
[    0.994012] raid6: neonx4   xor()  1203 MB/s
[    1.015350] raid6: neonx8   gen()  1312 MB/s
[    1.036704] raid6: neonx8   xor()  1236 MB/s
[    1.040954] raid6: using algorithm neonx8 gen() 1312 MB/s
[    1.046330] raid6: .... xor() 1236 MB/s, rmw enabled
[    1.051273] raid6: using neon recovery algorithm
[    1.056522] ambarella-dma e000a000.dma: Ambarella DMA Engine
[    1.062694] ambarella-dma e000b000.dma: Ambarella DMA Engine
[    1.068643] usbcore: registered new interface driver usbfs
[    1.074139] usbcore: registered new interface driver hub
[    1.079469] usbcore: registered new device driver usb
[    1.084813] ambarella-i2c e4008000.i2c: Ambarella I2C adapter[0] probed, clock:100000!
[    1.092924] ambarella-i2c e4009000.i2c: Ambarella I2C adapter[1] probed, clock:100000!
[    1.100984] Advanced Linux Sound Architecture Driver Initialized.
[    1.108241] clocksource: Switched to clocksource arch_sys_counter
[    1.118917] NET: Registered protocol family 2
[    1.123601] TCP established hash table entries: 16384 (order: 5, 131072 bytes)
[    1.130926] TCP bind hash table entries: 16384 (order: 6, 262144 bytes)
[    1.137742] TCP: Hash tables configured (established 16384 bind 16384)
[    1.144351] UDP hash table entries: 1024 (order: 3, 32768 bytes)
[    1.150381] UDP-Lite hash table entries: 1024 (order: 3, 32768 bytes)
[    1.156948] NET: Registered protocol family 1
[    1.161534] RPC: Registered named UNIX socket transport module.
[    1.167449] RPC: Registered udp transport module.
[    1.172136] RPC: Registered tcp transport module.
[    1.176826] RPC: Registered tcp NFSv4.1 backchannel transport module.
[    1.183367] Trying to unpack rootfs image as initramfs...
[    1.188886] rootfs image is not initramfs (junk in compressed archive); looks like an initrd
[    1.277557] Freeing initrd memory: 40960K
[    1.284749] workingset: timestamp_bits=62 max_order=19 bucket_order=0
[    1.295465] squashfs: version 4.0 (2009/01/31) Phillip Lougher
[    1.302143] fuse init (API version 7.26)
[    1.306327] SGI XFS with security attributes, no debug enabled
[    1.315845] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 250)
[    1.323224] io scheduler noop registered
[    1.327135] io scheduler deadline registered
[    1.331459] io scheduler cfq registered (default)
[    1.336151] io scheduler mq-deadline registered
[    1.340664] io scheduler kyber registered
[    1.345875] ambarella-gdma e000c000.gdma: Ambarella GDMA driver init
[    1.352477] e4000000.uart: ttyS0 at MMIO 0xe4000000 (irq = 11, base_baud = 1500000) is a ambuart
[    1.361484] e0016000.uart: ttyS1 at MMIO 0xe0016000 (irq = 32, base_baud = 1500000) is a ambuart
[    1.370462] e0017000.uart: ttyS2 at MMIO 0xe0017000 (irq = 33, base_baud = 1500000) is a ambuart
[    1.379478] cacheinfo: Unable to detect cache hierarchy for CPU 0
[    1.386047] brd: module loaded
[    1.393567] loop: module loaded
[    1.396782] Ambarella read-only mtdblock
[    1.401015] libphy: Fixed MDIO Bus: probed
[    1.405211] tun: Universal TUN/TAP device driver, 1.6
[    1.526247] libphy: Ambarella MDIO Bus: probed
[    1.532114] ambarella-eth e000e000.ethernet: Enhance Ethernet PHY[1]: 0x02430c54!
[    1.539894] ambarella-eth e000e000.ethernet: CONFIG_PTP_1588_CLOCK is not set
[    1.547017] ambarella-eth e000e000.ethernet: MAC Address[12:9a:82:ff:1d:4a].
[    1.554092] PPP generic driver version 2.4.2
[    1.558429] PPP BSD Compression module registered
[    1.563118] PPP Deflate Compression module registered
[    1.568174] PPP MPPE Compression module registered
[    1.572949] NET: Registered protocol family 24
[    1.577390] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    1.583906] ehci-ambarella: AMBARELLA-EHCI Host Controller driver
[    1.590073] ambarella-ehci e0009000.ehci: EHCI Host Controller
[    1.595903] ambarella-ehci e0009000.ehci: new USB bus registered, assigned bus number 1
[    1.604393] ambarella-ehci e0009000.ehci: irq 27, io mem 0xe0009000
[    1.617250] ambarella-ehci e0009000.ehci: USB 2.0 started, EHCI 1.00
[    1.623710] usb usb1: New USB device found, idVendor=1d6b, idProduct=0002
[    1.630483] usb usb1: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.637685] usb usb1: Product: EHCI Host Controller
[    1.642546] usb usb1: Manufacturer: Linux 4.14.183 ehci_hcd
[    1.648099] usb usb1: SerialNumber: AmbUSB
[    1.652486] hub 1-0:1.0: USB hub found
[    1.656247] hub 1-0:1.0: 1 port detected
[    1.660414] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    1.666652] ambarella-ohci e0008000.ohci: Ambarella OHCI
[    1.671957] ambarella-ohci e0008000.ohci: new USB bus registered, assigned bus number 2
[    1.679967] ambarella-ohci e0008000.ohci: irq 26, io mem 0xe0008000
[    1.742351] usb usb2: New USB device found, idVendor=1d6b, idProduct=0001
[    1.749123] usb usb2: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.756325] usb usb2: Product: Ambarella OHCI
[    1.760666] usb usb2: Manufacturer: Linux 4.14.183 ohci_hcd
[    1.766658] usb usb2: SerialNumber: AmbUSB
[    1.770990] hub 2-0:1.0: USB hub found
[    1.774742] hub 2-0:1.0: 1 port detected
[    1.778941] usbcore: registered new interface driver usbserial
[    1.784778] usbcore: registered new interface driver usbserial_generic
[    1.791305] usbserial: USB Serial support registered for generic
[    1.797346] ambarella-udc e0006000.udc: ambarella_udc: version 21 Jan 2016
[    1.812246] ambarella-rtc ec001000.rtc:  - time reset to 2001/1/1
[    1.818328] rtc rtc0: invalid alarm value: 1970-1-1 0:0:0
[    1.823794] ambarella-rtc ec001000.rtc: rtc core: registered ec001000.rtc as rtc0
[    1.831258] ambarella-rtc ec001000.rtc: Warning: RTC lost power.....
[    1.837693] i2c /dev entries driver
[    1.841631] ambarella-wdt ec002000.wdt: Ambarella Watchdog Timer Probed.
[    2.315315] ambarella-sd e0005000.sdmmc0: Max frequency is 120000000Hz
[    2.378266] ambarella-sd e0004000.sdmmc1: Max frequency is 25945946Hz
[    2.384761] optee: probing for conduit method from DT.
[    2.390118] optee: initialized driver
[    2.417424] Netfilter messages via NETLINK v0.30.
[    2.426402] ipip: IPv4 and MPLS over IPv4 tunneling driver
[    2.432192] ip_tables: (C) 2000-2006 Netfilter Core Team
[    2.443950] Initializing XFRM netlink socket
[    2.448583] NET: Registered protocol family 10
[    2.453617] Segment Routing with IPv6
[    2.457312] ip6_tables: (C) 2000-2006 Netfilter Core Team
[    2.480320] sit: IPv6, IPv4 and MPLS over IPv4 tunneling driver
[    2.486541] NET: Registered protocol family 17
[    2.491005] Bridge firewalling registered
[    2.495012] 8021q: 802.1Q VLAN Support v1.8
[    2.499214] Key type dns_resolver registered
[    2.504926] Btrfs loaded, crc32c=crc32c-generic
[    2.510893] console [netcon0] enabled
[    2.514552] netconsole: network logging started
[    2.533819] ambarella-rtc ec001000.rtc: setting system clock to 2000-01-01 00:00:01 UTC (946684801)
[    2.542990] ALSA device list:
[    2.545944]   No soundcards found.
[    2.549563] RAMDISK: squashfs filesystem found at block 0
[    2.554968] RAMDISK: Loading 12356KiB [1 disk] into ram disk... -
[    2.661121] \
[    2.769390] |
[    2.769784] done.
[    2.827748] VFS: Mounted root (squashfs filesystem) readonly on device 1:0.
[    2.834982] Freeing unused kernel memory: 384K
[    2.920183] mmc1: new MMC card at address 0001
[    2.925002] mmcblk1: mmc1:0001 8GTF4R 7.28 GiB
[    2.929653] mmcblk1boot0: mmc1:0001 8GTF4R partition 1 4.00 MiB
[    2.935674] mmcblk1boot1: mmc1:0001 8GTF4R partition 2 4.00 MiB
[    2.941682] mmcblk1rpmb: mmc1:0001 8GTF4R partition 3 512 KiB, chardev (249:0)
[    2.949164]  mmcblk1: p1(linux) p2(kernel0) p3(kernel1) p4(rootfs0) p5(rootfs1) p6(defconf0) p7(defconf1) p8(flashfs) p9(flashfs2) p10(backup)
[    3.062683] random: fast init done
[    3.142512] mmc0: new ultra high speed SDR104 SDHC card at address e624
[    3.149565] mmcblk0: mmc0:e624 SB32G 29.7 GiB
[    3.158246]  mmcblk0: p1
Detect SD card
[    8.620433] FAT-fs (mmcblk0p1): utf8 is not a recommended IO charset for FAT filesystems, filesystem will be case sensitive!
[    8.637113] FAT-fs (mmcblk0p1): Volume was not properly unmounted. Some data may be corrupt. Please run fsck.
Enter rescueSD
[    8.657881] gpioc: loading out-of-tree module taints kernel.
[    8.663793] GPIO Device Driver version 1.0.0.2
Bad block num/Total block num: 0/2
Enough good blocks.
check apply_patch_before
==========================================================================================
Start to set eMMC to SLC...
eMMC size: 7634944
Set SLC size: 3817472
Enhanced User Data Area Size [ENH_SIZE_MULT]: 0x0001d2
 i.e. 3817472 KiB
Max Enhanced Area Size [MAX_ENH_SIZE_MULT]: 0x0001d2
 i.e. 3817472 KiB
Done setting ENH_USR area on /dev/mmcblk1
setting OTP PARTITION_SETTING_COMPLETED!
Setting OTP PARTITION_SETTING_COMPLETED on /dev/mmcblk1 SUCCESS
Device power cycle needed for settings to take effect.
Confirm that PARTITION_SETTING_COMPLETED bit is set using 'extcsd read' after power cycle
Set eMMC to SLC complete. Reboot now!
==========================================================================================
[   10.184643] ambarella-wdt ec002000.wdt: ambarella_wdt_shutdown @ 5.
[   10.190946] reboot: Restarting system

NOTICE:  BL2: v2.1(release):fc60887-dirty
NOTICE:  BL2: Built : 12:17:27, Jan  3 2022
NOTICE:  ROTPK is not deployed on platform. Skipping ROTPK verification.
NOTICE:  BL2: Booting BL31

NOTICE:  BL31: Secure code at 0x100000
NOTICE:  BL31: Cleanup auto recovery request
NOTICE:  BL31: Non Secure code at 0x1400000
NOTICE:  BL31: v2.1(release):fc60887-dirty
NOTICE:  BL31: Built : 12:17:27, Jan  3 2022
NOTICE:  Stage2 Translation reserved 0xc00000

rmd image absent... skipping
Jumping to 0x01680000 ...
SOC signed DTB (RO).
SOC signed DTB (RO).
cpux_jump: 0x01400148
cmdline:
initrd2_start: 0x00000000 initrd2_size: 0x00000000
kernelp: 0x01600000 kernels: 0x7ea00000
iavp: 0x37800000 iavs: 0x48800000
fbp: 0x37800000 fbs: 0x00000000
dtbp: 0x37700000
[    0.000000] Booting Linux on physical CPU 0x0
[    0.000000] Linux version 4.14.183 (chewei.lin@rd1-5) (gcc version 8.2.1 20180802 (Linaro GCC 8.2-2018.08~dev)) #1 SMP PREEMPT Mon Jan 3 11:33:56 CST 2022
[    0.000000] Boot CPU: AArch64 Processor [410fd034]
[    0.000000] Machine model: Ambarella CV2BUB Board
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000034400000, size 48 MiB
[    0.000000] OF: reserved mem: initialized node linux,cma, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000037800000, size 644 MiB
[    0.000000] OF: reserved mem: initialized node iav@0x37800000, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000060000000, size 508 MiB
[    0.000000] OF: reserved mem: initialized node cavalry@0x60000000, compatible id shared-dma-pool
[    0.000000] psci: probing for conduit method from DT.
[    0.000000] psci: PSCIv1.1 detected in firmware.
[    0.000000] psci: Using standard PSCI v0.2 function IDs
[    0.000000] psci: Trusted OS migration not required
[    0.000000] psci: SMC Calling Convention v1.1
[    0.000000] percpu: Embedded 19 pages/cpu s38680 r8192 d30952 u77824
[    0.000000] Detected VIPT I-cache on CPU0
[    0.000000] CPU features: enabling workaround for ARM erratum 845719
[    0.000000] Speculative Store Bypass Disable mitigation not required
[    0.000000] Built 1 zonelists, mobility grouping on.  Total pages: 510552
[    0.000000] Kernel command line: console=ttyS0 root=/dev/ram0 ro rootfstype=squashfs initrd=0x2608000,40M ramdisk_size=320000 blkdevparts=mmcblk1:4G@0(linux),64M@0x100000(kernel0),64M@0x4100000(kernel1),240M@0x8100000(rootfs0),240M@0x17100000(rootfs1),8M@0x26100000(defconf0),8M@0x26900000(defconf1),32M@0x27100000(flashfs),2048M@0x29100000(flashfs2),1023M@0xA9100000(backup) user_debug=31
[    0.000000] PID hash table entries: 4096 (order: 3, 32768 bytes)
[    0.000000] Dentry cache hash table entries: 262144 (order: 9, 2097152 bytes)
[    0.000000] Inode-cache hash table entries: 131072 (order: 8, 1048576 bytes)
[    0.000000] Memory: 757064K/2074624K available (7998K kernel code, 630K rwdata, 2032K rodata, 384K init, 260K bss, 88760K reserved, 1228800K cma-reserved)
[    0.000000] Virtual kernel memory layout:
[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbebfff0000   (   250 GB)
[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008850000   (  8000 KB)
[    0.000000]     .rodata : 0xffffff8008850000 - 0xffffff8008a50000   (  2048 KB)
[    0.000000]       .init : 0xffffff8008a50000 - 0xffffff8008ab0000   (   384 KB)
[    0.000000]       .data : 0xffffff8008ab0000 - 0xffffff8008b4d808   (   631 KB)
[    0.000000]        .bss : 0xffffff8008b4d808 - 0xffffff8008b8e890   (   261 KB)
[    0.000000]     fixed   : 0xffffffbefe7fb000 - 0xffffffbefec00000   (  4116 KB)
[    0.000000]     PCI I/O : 0xffffffbefee00000 - 0xffffffbeffe00000   (    16 MB)
[    0.000000]     vmemmap : 0xffffffbf00000000 - 0xffffffc000000000   (     4 GB maximum)
[    0.000000]               0xffffffbf00058000 - 0xffffffbf02000000   (    31 MB actual)
[    0.000000]     memory  : 0xffffffc001600000 - 0xffffffc080000000   (  2026 MB)
[    0.000000] SLUB: HWalign=64, Order=0-3, MinObjects=0, CPUs=4, Nodes=1
[    0.000000] Preemptible hierarchical RCU implementation.
[    0.000000]  Tasks RCU enabled.
[    0.000000] NR_IRQS: 64, nr_irqs: 64, preallocated irqs: 0
[    0.000000] CPU features: GIC system register CPU interface present but disabled by higher exception level
[    0.000000] arch_timer: cp15 timer(s) running at 63.00MHz (virt).
[    0.000000] clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0xe879c5e9b, max_idle_ns: 440795204668 ns
[    0.000004] sched_clock: 56 bits at 63MHz, resolution 15ns, wraps every 2199023255548ns
[    0.000198] Console: colour dummy device 80x25
[    0.350806] console [ttyS0] enabled
[    0.354285] Calibrating delay loop (skipped), value calculated using timer frequency.. 126.00 BogoMIPS (lpj=63000)
[    0.364607] pid_max: default: 32768 minimum: 301
[    0.369290] Mount-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.375982] Mountpoint-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.387147] ASID allocator initialised with 32768 entries
[    0.394545] Hierarchical SRCU implementation.
[    0.403923] smp: Bringing up secondary CPUs ...
[    0.415588] Detected VIPT I-cache on CPU1
[    0.419608] CPU1: Booted secondary processor [410fd034]
[    0.431639] Detected VIPT I-cache on CPU2
[    0.435642] CPU2: Booted secondary processor [410fd034]
[    0.447717] Detected VIPT I-cache on CPU3
[    0.451721] CPU3: Booted secondary processor [410fd034]
[    0.456979] smp: Brought up 1 node, 4 CPUs
[    0.461068] SMP: Total of 4 processors activated.
[    0.465755] CPU features: detected: 32-bit EL0 Support
[    0.471340] CPU: All CPU(s) started at EL1
[    0.475432] alternatives: patching kernel code
[    0.480863] devtmpfs: initialized
[    0.488758] random: get_random_u32 called from bucket_table_alloc+0x108/0x268 with crng_init=0
[    0.497654] clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 1911260446275000 ns
[    0.507377] futex hash table entries: 1024 (order: 5, 131072 bytes)
[    0.546572] xor: measuring software checksum speed
[    0.561407]    8regs     :  1996.000 MB/sec
[    0.575607]    8regs_prefetch:  1724.000 MB/sec
[    0.590152]    32regs    :  2288.000 MB/sec
[    0.604351]    32regs_prefetch:  1940.000 MB/sec
[    0.608947] xor: using function: 32regs (2288.000 MB/sec)
[    0.614330] pinctrl core: initialized pinctrl subsystem
[    0.619823] NET: Registered protocol family 16
[    0.624885] vdso: 2 pages (1 code @ ffffff8008855000, 1 data @ ffffff8008ab4000)
[    0.638992] DMA: preallocated 256 KiB pool for atomic allocations
[    0.647801] ambarella-pinctrl ec003000.pinctrl: Ambarella pinctrl driver registered
[    0.656054] ambarella-gpio ec003000.pinctrl:gpio@0: Ambarella GPIO driver registered
[    0.669651] HugeTLB registered 2.00 MiB page size, pre-allocated 0 pages
[    0.693505] raid6: int64x1  gen()   382 MB/s
[    0.714880] raid6: int64x1  xor()   380 MB/s
[    0.736299] raid6: int64x2  gen()   589 MB/s
[    0.757665] raid6: int64x2  xor()   503 MB/s
[    0.779002] raid6: int64x4  gen()   839 MB/s
[    0.800347] raid6: int64x4  xor()   619 MB/s
[    0.821694] raid6: int64x8  gen()   988 MB/s
[    0.843050] raid6: int64x8  xor()   638 MB/s
[    0.864409] raid6: neonx1   gen()   632 MB/s
[    0.885748] raid6: neonx1   xor()   740 MB/s
[    0.907123] raid6: neonx2   gen()   972 MB/s
[    0.928463] raid6: neonx2   xor()   988 MB/s
[    0.949805] raid6: neonx4   gen()  1285 MB/s
[    0.971152] raid6: neonx4   xor()  1203 MB/s
[    0.992490] raid6: neonx8   gen()  1312 MB/s
[    1.013842] raid6: neonx8   xor()  1236 MB/s
[    1.018093] raid6: using algorithm neonx8 gen() 1312 MB/s
[    1.023469] raid6: .... xor() 1236 MB/s, rmw enabled
[    1.028413] raid6: using neon recovery algorithm
[    1.033657] ambarella-dma e000a000.dma: Ambarella DMA Engine
[    1.039829] ambarella-dma e000b000.dma: Ambarella DMA Engine
[    1.045779] usbcore: registered new interface driver usbfs
[    1.051275] usbcore: registered new interface driver hub
[    1.056605] usbcore: registered new device driver usb
[    1.061950] ambarella-i2c e4008000.i2c: Ambarella I2C adapter[0] probed, clock:100000!
[    1.070062] ambarella-i2c e4009000.i2c: Ambarella I2C adapter[1] probed, clock:100000!
[    1.078122] Advanced Linux Sound Architecture Driver Initialized.
[    1.085386] clocksource: Switched to clocksource arch_sys_counter
[    1.096065] NET: Registered protocol family 2
[    1.100750] TCP established hash table entries: 16384 (order: 5, 131072 bytes)
[    1.108075] TCP bind hash table entries: 16384 (order: 6, 262144 bytes)
[    1.114891] TCP: Hash tables configured (established 16384 bind 16384)
[    1.121500] UDP hash table entries: 1024 (order: 3, 32768 bytes)
[    1.127531] UDP-Lite hash table entries: 1024 (order: 3, 32768 bytes)
[    1.134097] NET: Registered protocol family 1
[    1.138679] RPC: Registered named UNIX socket transport module.
[    1.144593] RPC: Registered udp transport module.
[    1.149279] RPC: Registered tcp transport module.
[    1.153965] RPC: Registered tcp NFSv4.1 backchannel transport module.
[    1.160505] Trying to unpack rootfs image as initramfs...
[    1.166023] rootfs image is not initramfs (junk in compressed archive); looks like an initrd
[    1.254587] Freeing initrd memory: 40960K
[    1.261777] workingset: timestamp_bits=62 max_order=19 bucket_order=0
[    1.272487] squashfs: version 4.0 (2009/01/31) Phillip Lougher
[    1.279163] fuse init (API version 7.26)
[    1.283342] SGI XFS with security attributes, no debug enabled
[    1.292927] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 250)
[    1.300306] io scheduler noop registered
[    1.304216] io scheduler deadline registered
[    1.308540] io scheduler cfq registered (default)
[    1.313232] io scheduler mq-deadline registered
[    1.317745] io scheduler kyber registered
[    1.322954] ambarella-gdma e000c000.gdma: Ambarella GDMA driver init
[    1.329556] e4000000.uart: ttyS0 at MMIO 0xe4000000 (irq = 11, base_baud = 1500000) is a ambuart
[    1.338572] e0016000.uart: ttyS1 at MMIO 0xe0016000 (irq = 32, base_baud = 1500000) is a ambuart
[    1.347559] e0017000.uart: ttyS2 at MMIO 0xe0017000 (irq = 33, base_baud = 1500000) is a ambuart
[    1.356576] cacheinfo: Unable to detect cache hierarchy for CPU 0
[    1.363144] brd: module loaded
[    1.370709] loop: module loaded
[    1.373934] Ambarella read-only mtdblock
[    1.378161] libphy: Fixed MDIO Bus: probed
[    1.382351] tun: Universal TUN/TAP device driver, 1.6
[    1.503392] libphy: Ambarella MDIO Bus: probed
[    1.509255] ambarella-eth e000e000.ethernet: Enhance Ethernet PHY[1]: 0x02430c54!
[    1.517037] ambarella-eth e000e000.ethernet: CONFIG_PTP_1588_CLOCK is not set
[    1.524159] ambarella-eth e000e000.ethernet: MAC Address[ea:56:48:02:98:d0].
[    1.531234] PPP generic driver version 2.4.2
[    1.535571] PPP BSD Compression module registered
[    1.540260] PPP Deflate Compression module registered
[    1.545317] PPP MPPE Compression module registered
[    1.550093] NET: Registered protocol family 24
[    1.554535] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    1.561051] ehci-ambarella: AMBARELLA-EHCI Host Controller driver
[    1.567220] ambarella-ehci e0009000.ehci: EHCI Host Controller
[    1.573049] ambarella-ehci e0009000.ehci: new USB bus registered, assigned bus number 1
[    1.581578] ambarella-ehci e0009000.ehci: irq 27, io mem 0xe0009000
[    1.594395] ambarella-ehci e0009000.ehci: USB 2.0 started, EHCI 1.00
[    1.600856] usb usb1: New USB device found, idVendor=1d6b, idProduct=0002
[    1.607628] usb usb1: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.614830] usb usb1: Product: EHCI Host Controller
[    1.619691] usb usb1: Manufacturer: Linux 4.14.183 ehci_hcd
[    1.625245] usb usb1: SerialNumber: AmbUSB
[    1.629630] hub 1-0:1.0: USB hub found
[    1.633390] hub 1-0:1.0: 1 port detected
[    1.637562] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    1.643801] ambarella-ohci e0008000.ohci: Ambarella OHCI
[    1.649107] ambarella-ohci e0008000.ohci: new USB bus registered, assigned bus number 2
[    1.657116] ambarella-ohci e0008000.ohci: irq 26, io mem 0xe0008000
[    1.719489] usb usb2: New USB device found, idVendor=1d6b, idProduct=0001
[    1.726261] usb usb2: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.733463] usb usb2: Product: Ambarella OHCI
[    1.737804] usb usb2: Manufacturer: Linux 4.14.183 ohci_hcd
[    1.743358] usb usb2: SerialNumber: AmbUSB
[    1.748098] hub 2-0:1.0: USB hub found
[    1.751852] hub 2-0:1.0: 1 port detected
[    1.756049] usbcore: registered new interface driver usbserial
[    1.761886] usbcore: registered new interface driver usbserial_generic
[    1.768413] usbserial: USB Serial support registered for generic
[    1.774453] ambarella-udc e0006000.udc: ambarella_udc: version 21 Jan 2016
[    1.783722] rtc rtc0: invalid alarm value: 1970-1-1 0:0:0
[    1.789191] ambarella-rtc ec001000.rtc: rtc core: registered ec001000.rtc as rtc0
[    1.796656] ambarella-rtc ec001000.rtc: Warning: RTC lost power.....
[    1.803093] i2c /dev entries driver
[    1.807019] ambarella-wdt ec002000.wdt: Ambarella Watchdog Timer Probed.
[    2.273463] ambarella-sd e0005000.sdmmc0: Max frequency is 120000000Hz
[    2.336412] ambarella-sd e0004000.sdmmc1: Max frequency is 25945946Hz
[    2.342905] optee: probing for conduit method from DT.
[    2.348254] optee: initialized driver
[    2.375633] Netfilter messages via NETLINK v0.30.
[    2.384547] ipip: IPv4 and MPLS over IPv4 tunneling driver
[    2.390338] ip_tables: (C) 2000-2006 Netfilter Core Team
[    2.402092] Initializing XFRM netlink socket
[    2.406725] NET: Registered protocol family 10
[    2.411753] Segment Routing with IPv6
[    2.415448] ip6_tables: (C) 2000-2006 Netfilter Core Team
[    2.438463] sit: IPv6, IPv4 and MPLS over IPv4 tunneling driver
[    2.444680] NET: Registered protocol family 17
[    2.449146] Bridge firewalling registered
[    2.453152] 8021q: 802.1Q VLAN Support v1.8
[    2.457354] Key type dns_resolver registered
[    2.463067] Btrfs loaded, crc32c=crc32c-generic
[    2.469027] console [netcon0] enabled
[    2.472686] netconsole: network logging started
[    2.491965] ambarella-rtc ec001000.rtc: setting system clock to 2000-01-01 00:00:18 UTC (946684818)
[    2.501137] ALSA device list:
[    2.504090]   No soundcards found.
[    2.507710] RAMDISK: squashfs filesystem found at block 0
[    2.513116] RAMDISK: Loading 12356KiB [1 disk] into ram disk... -
[    2.619278] \
[    2.727515] |
[    2.727908] done.
[    2.784369] VFS: Mounted root (squashfs filesystem) readonly on device 1:0.
[    2.791625] Freeing unused kernel memory: 384K
[    2.874314] mmc1: new MMC card at address 0001
[    2.879150] mmcblk1: mmc1:0001 8GTF4R 3.64 GiB
[    2.883800] mmcblk1boot0: mmc1:0001 8GTF4R partition 1 4.00 MiB
[    2.889823] mmcblk1boot1: mmc1:0001 8GTF4R partition 2 4.00 MiB
[    2.895833] mmcblk1rpmb: mmc1:0001 8GTF4R partition 3 512 KiB, chardev (249:0)
[    2.903313]  mmcblk1: p1(linux) p2(kernel0) p3(kernel1) p4(rootfs0) p5(rootfs1) p6(defconf0) p7(defconf1) p8(flashfs) p9(flashfs2) p10(backup)
[    3.011795] random: fast init done
[    3.091483] mmc0: new ultra high speed SDR104 SDHC card at address e624
[    3.098520] mmcblk0: mmc0:e624 SB32G 29.7 GiB
[    3.107148]  mmcblk0: p1
Detect SD card
[    8.575235] FAT-fs (mmcblk0p1): utf8 is not a recommended IO charset for FAT filesystems, filesystem will be case sensitive!
[    8.591670] FAT-fs (mmcblk0p1): Volume was not properly unmounted. Some data may be corrupt. Please run fsck.
Enter rescueSD
[    8.612397] gpioc: loading out-of-tree module taints kernel.
[    8.618302] GPIO Device Driver version 1.0.0.2
Bad block num/Total block num: 0/2
Enough good blocks.
check apply_patch_before
========================
eMMC already set to SLC.
========================
mke2fs 1.42.8 (20-Jun-2013)
ext2fs_check_if_mount: Can't check if filesystem is mounted due to missing mtab file while determining whether /dev/mmcblk1-backup is mounted.
Discarding device blocks: done
[    9.978637] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
[    9.985435] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
Filesystem label=
OS type: Linux
Block size=4096 (log=2)
Fragment size=4096 (log=2)
Stride=0 blocks, Stripe width=0 blocks
65536 inodes, 261888 blocks
13094 blocks (5.00%) reserved for the super user
First data block=0
Maximum filesystem blocks=268435456
8 block groups
32768 blocks per group, 32768 fragments per group
8192 inodes per group
Superblock backups stored on blocks:
        32768, 98304, 163840, 229376

Allocating group tables: done
Writing inode tables: done
Creating journal (4096 blocks): done
Writing superblocks and filesystem accounting information: done

[   10.892270] EXT4-fs (mmcblk1p10): mounted filesystem with ordered data mode. Opts: (null)
mke2fs 1.42.8 (20-Jun-2013)
ext2fs_check_if_mount: Can't check if filesystem is mounted due to missing mtab file while determining whether /dev/mmcblk1-defconf0 is mounted.
Discarding device blocks: done
[   10.937507] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
Filesystem label=
OS type: Linux
Block size=1024 (log=0)
Fragment size=1024 (log=0)
Stride=0 blocks, Stripe width=0 blocks
2048 inodes, 8192 blocks
409 blocks (4.99%) reserved for the super user
First data block=1
Maximum filesystem blocks=8388608
1 block group
8192 blocks per group, 8192 fragments per group
2048 inodes per group

Allocating group tables: done
Writing inode tables: done
Creating journal (1024 blocks): done
Writing superblocks and filesystem accounting information: done

mke2fs 1.42.8 (20-Jun-2013)
ext2fs_check_if_mount: Can't check if filesystem is mounted due to missing mtab file while determining whether /dev/mmcblk1-defconf1 is mounted.
Discarding device blocks: done
[   11.101057] urandom_read: 1 callbacks suppressed
[   11.101061] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
[   11.112460] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
Filesystem label=
OS type: Linux
Block size=1024 (log=0)
Fragment size=1024 (log=0)
Stride=0 blocks, Stripe width=0 blocks
2048 inodes, 8192 blocks
409 blocks (4.99%) reserved for the super user
First data block=1
Maximum filesystem blocks=8388608
1 block group
8192 blocks per group, 8192 fragments per group
2048 inodes per group

Allocating group tables: done
Writing inode tables: done
Creating journal (1024 blocks): done
Writing superblocks and filesystem accounting information: done

mke2fs 1.42.8 (20-Jun-2013)
ext2fs_check_if_mount: Can't check if filesystem is mounted due to missing mtab file while determining whether /dev/mmcblk1-flash2 is mounted.
Discarding device blocks: done
[   11.879358] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
Filesystem label=
OS type: Linux
Block size=4096 (log=2)
Fragment size=4096 (log=2)
Stride=0 blocks, Stripe width=0 blocks
131072 inodes, 524288 blocks
26214 blocks (5.00%) reserved for the super user
First data block=0
Maximum filesystem blocks=536870912
16 block groups
32768 blocks per group, 32768 fragments per group
8192 inodes per group
Superblock backups stored on blocks:
        32768, 98304, 163840, 229376, 294912

Allocating group tables: done
Writing inode tables: done
Creating journal (16384 blocks): done
Writing superblocks and filesystem accounting information: done

[   15.470775] EXT4-fs (mmcblk1p9): mounted filesystem with ordered data mode. Opts: (null)
[   18.663314] urandom_read: 1 callbacks suppressed
[   18.663320] random: encfs: uninitialized urandom read (32 bytes read)
Creating new encrypted volume.
Please choose from one of the following options:
 enter "x" for expert configuration mode,
 enter "p" for pre-configured paranoia mode,
 anything else, or an empty line will select standard mode.
?>
Standard configuration selected.

Configuration finished.  The filesystem to be created has
the following properties:
Filesystem cipher: "ssl/aes", version 3:0:2
Filename encoding: "nameio/block", version 4:0:2
Key Size: 192 bits
Block Size: 1024 bytes
Each file contains 8 byte header with unique IV data.
Filenames encoded using IV chaining mode.
File holes passed through to ciphertext.

Now you will need to enter a password for your filesystem.
You will need to remember this password, as there is absolutely
no recovery mechanism.  However, the password can be changed
later using encfsctl.

[   19.418736] random: encfs: uninitialized urandom read (32 bytes read)
Creating new encrypted volume.
Please choose from one of the following options:
 enter "x" for expert configuration mode,
 enter "p" for pre-configured paranoia mode,
 anything else, or an empty line will select standard mode.
?>
Standard configuration selected.

Configuration finished.  The filesystem to be created has
the following properties:
Filesystem cipher: "ssl/aes", version 3:0:2
Filename encoding: "nameio/block", version 4:0:2
Key Size: 192 bits
Block Size: 1024 bytes
Each file contains 8 byte header with unique IV data.
Filenames encoded using IV chaining mode.
File holes passed through to ciphertext.

Now you will need to enter a password for your filesystem.
You will need to remember this password, as there is absolutely
no recovery mechanism.  However, the password can be changed
later using encfsctl.

Pkg version: 1.3f.a3.1.13
Support script version : 0101a
System image size = 45781104
58619696:error:0606506D:digital envelope routines:EVP_DecryptFinal_ex:wrong final block length:evp_enc.c:552:
58619696:error:0606506D:digital envelope routines:EVP_DecryptFinal_ex:wrong final block length:evp_enc.c:552:
[src/sysparam.c:485]: "lsc" is not exist!
[src/sysparam.c:485]: "dpc" is not exist!
[src/sysparam.c:485]: "awb" is not exist!
[src/sysparam.c:485]: "sensor_calibration" is not exist!
[src/sysparam.c:485]: "gsensorraw" is not exist!
"cleantlv" write successfully!
"pid" write successfully!
WARNING: can't open config file: /home/frank.chung/Ambarella_SDK/code_test/openssl-1.0.2r/_install/openssl.cnf
unable to write 'random state'
"macaddress" write successfully!
"debug_status" write successfully!
"debugtime" write successfully!
"enable_sftp" write successfully!
PID=CV2-IMX335-SC9133-202006c
PID_INFO=CV2-IMX335-SC9133-202006c   adocodec_wm8974     SC9133      SC9133      SC9133      SC9133      SC9133-VVTK-1.2102.36.01f_0103       sc9133s88v13.bld.bin   vvtkcv2_sc9133v13.dtb      sc9133s88v13.bst.bp1.bin     sc9133s88v13.bst.bp2.bin
GYRO_SPIBUS=
GYRO_SPICS=
[   69.045953] gyro_icm40608: `' invalid for parameter `spi_bus'
[   69.051699] gyro_icm40608: `' invalid for parameter `spi_cs'
[   69.069954] gyro_icm40608: `' invalid for parameter `spi_bus'
[   69.075705] gyro_icm40608: `' invalid for parameter `spi_cs'
insmod: can't insert '/usr/bin/gyro_icm40608.ko': Invalid argument
rmmod: can't unload module 'gyro_icm40608': No such file or directory
[   69.113743] gyro_drv: `' invalid for parameter `spi_bus'
[   69.119054] gyro_drv: `' invalid for parameter `spi_cs'
[   69.137872] gyro_drv: `' invalid for parameter `spi_bus'
[   69.143193] gyro_drv: `' invalid for parameter `spi_cs'
insmod: can't insert '/usr/bin/gyro_drv.ko': Invalid argument
pid: CV2-IMX335-SC9133-202006c
firmware burning from SD card
/etc/init.d/rcS-RS: [   77.267935] random: crng init done
setup/update_model_difference: line 451: upgrade_log_add: not found
/etc/init.d/rcS-RS: setup/update_model_difference: line 184: can't create /mnt/flash2/log/upgrade.log: nonexistent directory
ls: /mnt/backup/firmware/setup/vadppkg/*.xml: No such file or directory
ls: /mnt/backup/firmware/setup/vadppkg/*.json: No such file or directory
ls: /mnt/backup/firmware/setup/vadppkg/*.xml: No such file or directory
VADP packages total size = 76686645
The resource storage size = 1919336448
Copy VADP packages successfully!
VADP version is greater or equal 1.4.0.0, so we change install package path and license path
cp: can't stat '/mnt/mmc/SC9133-023BBBC8267F.json': No such file or directory
cp: can't stat '/mnt/mmc/*tar.gz': No such file or directory
Set boot form Normal FW
Set boot partition successfully!
Upgrade Backup FW
==== Upgrade BP1 bst ====
8+0 records in
8+0 records out
4096 bytes (4.0KB) copied, 0.005937 seconds, 673.7KB/s
==== Upgrade BP1 bld ====
1311+1 records in
1311+1 records out
671520 bytes (655.8KB) copied, 0.087205 seconds, 7.3MB/s
==== Upgrade BP1 atf ====
148+0 records in
148+0 records out
75776 bytes (74.0KB) copied, 0.012469 seconds, 5.8MB/s
==== Upgrade kernel1  ====
22124+1 records in
22124+1 records out
11327824 bytes (10.8MB) copied, 1.375094 seconds, 7.9MB/s
==== Upgrade kernel1 dtb ====
71+1 records in
71+1 records out
36480 bytes (35.6KB) copied, 0.007389 seconds, 4.7MB/s
==== Upgrade rootfs1  ====
64576+1 records in
64576+1 records out
33063248 bytes (31.5MB) copied, 4.172359 seconds, 7.6MB/s
==== Upgrade defconf1 ====
[  107.257734] EXT4-fs (mmcblk1p7): mounted filesystem with ordered data mode. Opts: (null)
rm: can't remove '/mnt/ramdisk/defconf1/*.tar': No such file or directory
Update secureboot key
NOTICE:  Reading the monotonic counter
cat: can't open '/setup/count': No such file or directory
Failed to read FW count
Set boot form Backup FW
Set boot partition successfully!
Change flash status from 3 to 1
"flashstatus" write successfully!
Upgrade Normal FW
==== Upgrade BP0 bst ====
8+0 records in
8+0 records out
4096 bytes (4.0KB) copied, 0.004993 seconds, 801.1KB/s
==== Upgrade BP0 bld ====
1311+1 records in
1311+1 records out
671520 bytes (655.8KB) copied, 0.104091 seconds, 6.2MB/s
==== Upgrade BP0 atf ====
148+0 records in
148+0 records out
75776 bytes (74.0KB) copied, 0.014346 seconds, 5.0MB/s
==== Upgrade kernel0  ====
22124+1 records in
22124+1 records out
11327824 bytes (10.8MB) copied, 1.376064 seconds, 7.9MB/s
==== Upgrade kernel0 dtb ====
71+1 records in
71+1 records out
36480 bytes (35.6KB) copied, 0.007096 seconds, 4.9MB/s
==== Upgrade rootfs0  ====
64576+1 records in
64576+1 records out
33063248 bytes (31.5MB) copied, 4.177862 seconds, 7.5MB/s
==== Upgrade defconf0 ====
[  113.330200] EXT4-fs (mmcblk1p6): mounted filesystem with ordered data mode. Opts: (null)
rm: can't remove '/mnt/ramdisk/defconf0/*.tar': No such file or directory
mkdir: can't create directory '/mnt/ramdisk/defconf0': File exists
mkdir: can't create directory '/mnt/ramdisk/defconf1': File exists
mount: mounting /dev/mmcblk1-defconf0 on /mnt/ramdisk/defconf0 failed: Device or resource busy
mount: mounting /dev/mmcblk1-defconf1 on /mnt/ramdisk/defconf1 failed: Device or resource busy
Install dynamicBurnInTool ...
"flashstatus" write successfully!
check apply_patch_after
macaddress=02:3B:BB:C8:26:7F
 Done!!

NOTICE:  BL2: v2.1(release):fc60887-dirty
NOTICE:  BL2: Built : 12:17:27, Jan  3 2022
NOTICE:  ROTPK is not deployed on platform. Skipping ROTPK verification.
NOTICE:  BL2: Booting BL31

NOTICE:  BL31: Secure code at 0x100000
NOTICE:  BL31: Cleanup auto recovery request
NOTICE:  BL31: Non Secure code at 0x1400000
NOTICE:  BL31: v2.1(release):fc60887-dirty
NOTICE:  BL31: Built : 12:17:27, Jan  3 2022
NOTICE:  Stage2 Translation reserved 0xc00000

Debug Mode: Y (sysparam)
  __      _   _____  __      _    ____     _______   ______    _   _
  \ \    / / |_   _| \ \    / /  / __ \   |__   __| |  ____|  | | / /
   \ \  / /    | |    \ \  / /  / /  \ \     | |    | |____   | |/ /
    \ \/ /     | |     \ \/ /  | |    | |    | |    |  ____|  |   \
     \  /     _| |_     \  /    \ \__/ /     | |    | |____   | |\ \
      \/     |_____|     \/      \____/      |_|    |______|  |_| \_\

Target platform: VVTK_SC9133S88V13 (20201127)

Get ptb failed!
auto boot......


amboot-dirty (Jan 03 2022 - 12:17:21) (DLL VALUE = 0x071f02)


S/N:
usbdl_mode: 0
auto_boot: 1
bootcmd:

===== Boot from SD =====
No card detected in SD slots

===== Boot from EMMC =====
Boot partition = 2
Read backup kernel and dtb
   Read mkimage from EMMC 04100000 to DRAM 0167ffc0
   Image Name:   linux-4.14
   Image Type:   ARM Linux Kernel Image (uncompressed)
   Data Size:    11327760 Bytes = 10.8 MB
   Load Address: 00280000
   Entry Point:  00280000
   Verifying Checksum ... OK
   Verifying Signature ... OK
   Decrypt Ciphertext ... OK
   Read mkimage from EMMC 04bcda00 to DRAM 02507fc0
   Image Name:   linux-4.14
   Image Type:   ARM Linux Kernel Image (uncompressed)
   Data Size:    36416 Bytes = 35.6 kB
   Load Address: 00a08000
   Entry Point:  00a08000
   Verifying Checksum ... OK
   Verifying Signature ... OK
   Decrypt Ciphertext ... OK
Read backup rootfs
   Read mkimage from EMMC 17100000 to DRAM 02607fc0
   Image Name:   Rootfs
   Image Type:   ARM Linux Filesystem Image (uncompressed)
   Data Size:    33063184 Bytes = 31.5 MB
   Load Address: 02ffffc0
   Entry Point:  03000000
   Verifying Checksum ... OK
   Verifying Signature ... OK
   Decrypt Ciphertext ... OK
rmd image absent... skipping
Jumping to 0x01680000 ...
SOC signed DTB (RO).
SOC signed DTB (RO).
cpux_jump: 0x01400148
cmdline:
initrd2_start: 0x00000000 initrd2_size: 0x00000000
kernelp: 0x01600000 kernels: 0x7ea00000
iavp: 0x37800000 iavs: 0x48800000
fbp: 0x37800000 fbs: 0x00000000
dtbp: 0x37700000
[    0.000000] Booting Linux on physical CPU 0x0
[    0.000000] Linux version 4.14.183 (chewei.lin@rd1-5) (gcc version 8.2.1 20180802 (Linaro GCC 8.2-2018.08~dev)) #8 SMP PREEMPT Mon Jan 3 12:18:29 CST 2022
[    0.000000] Boot CPU: AArch64 Processor [410fd034]
[    0.000000] Machine model: Ambarella CV2BUB Board
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000034400000, size 48 MiB
[    0.000000] OF: reserved mem: initialized node linux,cma, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000037800000, size 644 MiB
[    0.000000] OF: reserved mem: initialized node iav@0x37800000, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000060000000, size 508 MiB
[    0.000000] OF: reserved mem: initialized node cavalry@0x60000000, compatible id shared-dma-pool
[    0.000000] psci: probing for conduit method from DT.
[    0.000000] psci: PSCIv1.1 detected in firmware.
[    0.000000] psci: Using standard PSCI v0.2 function IDs
[    0.000000] psci: Trusted OS migration not required
[    0.000000] psci: SMC Calling Convention v1.1
[    0.000000] percpu: Embedded 19 pages/cpu s38680 r8192 d30952 u77824
[    0.000000] Detected VIPT I-cache on CPU0
[    0.000000] CPU features: enabling workaround for ARM erratum 845719
[    0.000000] Speculative Store Bypass Disable mitigation not required
[    0.000000] Built 1 zonelists, mobility grouping on.  Total pages: 510552
[    0.000000] Kernel command line: console=ttyS0 root=/dev/ram0 ro rootfstype=squashfs initrd=0x2608000,40M ramdisk_size=320000 blkdevparts=mmcblk1:4G@0(linux),64M@0x100000(kernel0),64M@0x4100000(kernel1),240M@0x8100000(rootfs0),240M@0x17100000(rootfs1),8M@0x26100000(defconf0),8M@0x26900000(defconf1),32M@0x27100000(flashfs),2048M@0x29100000(flashfs2),1023M@0xA9100000(backup) user_debug=31
[    0.000000] PID hash table entries: 4096 (order: 3, 32768 bytes)
[    0.000000] Dentry cache hash table entries: 262144 (order: 9, 2097152 bytes)
[    0.000000] Inode-cache hash table entries: 131072 (order: 8, 1048576 bytes)
[    0.000000] Memory: 757064K/2074624K available (7998K kernel code, 630K rwdata, 2032K rodata, 384K init, 260K bss, 88760K reserved, 1228800K cma-reserved)
[    0.000000] Virtual kernel memory layout:
[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbebfff0000   (   250 GB)
[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008850000   (  8000 KB)
[    0.000000]     .rodata : 0xffffff8008850000 - 0xffffff8008a50000   (  2048 KB)
[    0.000000]       .init : 0xffffff8008a50000 - 0xffffff8008ab0000   (   384 KB)
[    0.000000]       .data : 0xffffff8008ab0000 - 0xffffff8008b4d808   (   631 KB)
[    0.000000]        .bss : 0xffffff8008b4d808 - 0xffffff8008b8e890   (   261 KB)
[    0.000000]     fixed   : 0xffffffbefe7fb000 - 0xffffffbefec00000   (  4116 KB)
[    0.000000]     PCI I/O : 0xffffffbefee00000 - 0xffffffbeffe00000   (    16 MB)
[    0.000000]     vmemmap : 0xffffffbf00000000 - 0xffffffc000000000   (     4 GB maximum)
[    0.000000]               0xffffffbf00058000 - 0xffffffbf02000000   (    31 MB actual)
[    0.000000]     memory  : 0xffffffc001600000 - 0xffffffc080000000   (  2026 MB)
[    0.000000] SLUB: HWalign=64, Order=0-3, MinObjects=0, CPUs=4, Nodes=1
[    0.000000] Preemptible hierarchical RCU implementation.
[    0.000000]  Tasks RCU enabled.
[    0.000000] NR_IRQS: 64, nr_irqs: 64, preallocated irqs: 0
[    0.000000] CPU features: GIC system register CPU interface present but disabled by higher exception level
[    0.000000] vco = 408000000, 24000000, 1, 17, 1
[    0.000000] vco = 384000000, 24000000, 1, 16, 1
[    0.000000] vco = 384000000, 24000000, 1, 16, 1
[    0.000000] vco = 1176000000, 24000000, 1, 49, 1
[    0.000000] vco = 1176000000, 24000000, 1, 49, 1
[    0.000000] arch_timer: cp15 timer(s) running at 63.00MHz (virt).
[    0.000000] clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0xe879c5e9b, max_idle_ns: 440795204668 ns
[    0.000004] sched_clock: 56 bits at 63MHz, resolution 15ns, wraps every 2199023255548ns
[    0.000198] Console: colour dummy device 80x25
[    0.373509] console [ttyS0] enabled
[    0.376988] Calibrating delay loop (skipped), value calculated using timer frequency.. 126.00 BogoMIPS (lpj=63000)
[    0.387310] pid_max: default: 32768 minimum: 301
[    0.391992] Mount-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.398683] Mountpoint-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.409847] ASID allocator initialised with 32768 entries
[    0.417245] Hierarchical SRCU implementation.
[    0.426621] smp: Bringing up secondary CPUs ...
[    0.438286] Detected VIPT I-cache on CPU1
[    0.442306] CPU1: Booted secondary processor [410fd034]
[    0.454337] Detected VIPT I-cache on CPU2
[    0.458341] CPU2: Booted secondary processor [410fd034]
[    0.470415] Detected VIPT I-cache on CPU3
[    0.474419] CPU3: Booted secondary processor [410fd034]
[    0.479677] smp: Brought up 1 node, 4 CPUs
[    0.483766] SMP: Total of 4 processors activated.
[    0.488453] CPU features: detected: 32-bit EL0 Support
[    0.494041] CPU: All CPU(s) started at EL1
[    0.498132] alternatives: patching kernel code
[    0.503558] devtmpfs: initialized
[    0.511551] random: get_random_u32 called from bucket_table_alloc+0x108/0x268 with crng_init=0
[    0.520450] clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 1911260446275000 ns
[    0.530172] futex hash table entries: 1024 (order: 5, 131072 bytes)
[    0.569296] xor: measuring software checksum speed
[    0.584132]    8regs     :  1996.000 MB/sec
[    0.598332]    8regs_prefetch:  1724.000 MB/sec
[    0.612877]    32regs    :  2288.000 MB/sec
[    0.627076]    32regs_prefetch:  1940.000 MB/sec
[    0.631673] xor: using function: 32regs (2288.000 MB/sec)
[    0.637055] pinctrl core: initialized pinctrl subsystem
[    0.642549] NET: Registered protocol family 16
[    0.647606] vdso: 2 pages (1 code @ ffffff8008855000, 1 data @ ffffff8008ab4000)
[    0.661688] DMA: preallocated 256 KiB pool for atomic allocations
[    0.670505] ambarella-pinctrl ec003000.pinctrl: Ambarella pinctrl driver registered
[    0.678760] ambarella-gpio ec003000.pinctrl:gpio@0: Ambarella GPIO driver registered
[    0.692467] HugeTLB registered 2.00 MiB page size, pre-allocated 0 pages
[    0.716353] raid6: int64x1  gen()   382 MB/s
[    0.737682] raid6: int64x1  xor()   378 MB/s
[    0.759106] raid6: int64x2  gen()   589 MB/s
[    0.780495] raid6: int64x2  xor()   503 MB/s
[    0.801833] raid6: int64x4  gen()   839 MB/s
[    0.823179] raid6: int64x4  xor()   619 MB/s
[    0.844525] raid6: int64x8  gen()   988 MB/s
[    0.865873] raid6: int64x8  xor()   638 MB/s
[    0.887207] raid6: neonx1   gen()   632 MB/s
[    0.908559] raid6: neonx1   xor()   740 MB/s
[    0.929946] raid6: neonx2   gen()   972 MB/s
[    0.951283] raid6: neonx2   xor()   988 MB/s
[    0.972635] raid6: neonx4   gen()  1285 MB/s
[    0.993977] raid6: neonx4   xor()  1203 MB/s
[    1.015345] raid6: neonx8   gen()  1316 MB/s
[    1.036691] raid6: neonx8   xor()  1236 MB/s
[    1.040941] raid6: using algorithm neonx8 gen() 1316 MB/s
[    1.046316] raid6: .... xor() 1236 MB/s, rmw enabled
[    1.051260] raid6: using neon recovery algorithm
[    1.056517] ambarella-dma e000a000.dma: Ambarella DMA Engine
[    1.062693] ambarella-dma e000b000.dma: Ambarella DMA Engine
[    1.068645] usbcore: registered new interface driver usbfs
[    1.074141] usbcore: registered new interface driver hub
[    1.079471] usbcore: registered new device driver usb
[    1.084821] ambarella-i2c e4008000.i2c: Ambarella I2C adapter[0] probed, clock:100000!
[    1.092933] ambarella-i2c e4009000.i2c: Ambarella I2C adapter[1] probed, clock:100000!
[    1.100992] Advanced Linux Sound Architecture Driver Initialized.
[    1.108266] clocksource: Switched to clocksource arch_sys_counter
[    1.118987] NET: Registered protocol family 2
[    1.123670] TCP established hash table entries: 16384 (order: 5, 131072 bytes)
[    1.130994] TCP bind hash table entries: 16384 (order: 6, 262144 bytes)
[    1.137825] TCP: Hash tables configured (established 16384 bind 16384)
[    1.144437] UDP hash table entries: 1024 (order: 3, 32768 bytes)
[    1.150467] UDP-Lite hash table entries: 1024 (order: 3, 32768 bytes)
[    1.157032] NET: Registered protocol family 1
[    1.161616] RPC: Registered named UNIX socket transport module.
[    1.167531] RPC: Registered udp transport module.
[    1.172218] RPC: Registered tcp transport module.
[    1.176909] RPC: Registered tcp NFSv4.1 backchannel transport module.
[    1.183452] Trying to unpack rootfs image as initramfs...
[    1.188972] rootfs image is not initramfs (junk in compressed archive); looks like an initrd
[    1.277646] Freeing initrd memory: 40960K
[    1.284802] workingset: timestamp_bits=62 max_order=19 bucket_order=0
[    1.295532] squashfs: version 4.0 (2009/01/31) Phillip Lougher
[    1.302185] fuse init (API version 7.26)
[    1.306370] SGI XFS with security attributes, no debug enabled
[    1.315886] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 250)
[    1.323272] io scheduler noop registered
[    1.327179] io scheduler deadline registered
[    1.331507] io scheduler cfq registered (default)
[    1.336196] io scheduler mq-deadline registered
[    1.340711] io scheduler kyber registered
[    1.345931] ambarella-gdma e000c000.gdma: Ambarella GDMA driver init
[    1.352524] e4000000.uart: ttyS0 at MMIO 0xe4000000 (irq = 11, base_baud = 1500000) is a ambuart
[    1.361531] e0016000.uart: ttyS1 at MMIO 0xe0016000 (irq = 32, base_baud = 1500000) is a ambuart
[    1.370513] e0017000.uart: ttyS2 at MMIO 0xe0017000 (irq = 33, base_baud = 1500000) is a ambuart
[    1.379518] cacheinfo: Unable to detect cache hierarchy for CPU 0
[    1.386084] brd: module loaded
[    1.393591] loop: module loaded
[    1.396807] Ambarella read-only mtdblock
[    1.401036] libphy: Fixed MDIO Bus: probed
[    1.405233] tun: Universal TUN/TAP device driver, 1.6
[    1.526273] libphy: Ambarella MDIO Bus: probed
[    1.532136] ambarella-eth e000e000.ethernet: Enhance Ethernet PHY[1]: 0x02430c54!
[    1.539916] ambarella-eth e000e000.ethernet: CONFIG_PTP_1588_CLOCK is not set
[    1.547038] ambarella-eth e000e000.ethernet: MAC Address[12:0d:b0:3c:ad:b9].
[    1.554114] PPP generic driver version 2.4.2
[    1.558452] PPP BSD Compression module registered
[    1.563141] PPP Deflate Compression module registered
[    1.568196] PPP MPPE Compression module registered
[    1.572972] NET: Registered protocol family 24
[    1.577412] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    1.583928] ehci-ambarella: AMBARELLA-EHCI Host Controller driver
[    1.590095] ambarella-ehci e0009000.ehci: EHCI Host Controller
[    1.595924] ambarella-ehci e0009000.ehci: new USB bus registered, assigned bus number 1
[    1.604430] ambarella-ehci e0009000.ehci: irq 27, io mem 0xe0009000
[    1.617276] ambarella-ehci e0009000.ehci: USB 2.0 started, EHCI 1.00
[    1.623742] usb usb1: New USB device found, idVendor=1d6b, idProduct=0002
[    1.630515] usb usb1: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.637717] usb usb1: Product: EHCI Host Controller
[    1.642577] usb usb1: Manufacturer: Linux 4.14.183 ehci_hcd
[    1.648131] usb usb1: SerialNumber: AmbUSB
[    1.652517] hub 1-0:1.0: USB hub found
[    1.656276] hub 1-0:1.0: 1 port detected
[    1.660446] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    1.666685] ambarella-ohci e0008000.ohci: Ambarella OHCI
[    1.671994] ambarella-ohci e0008000.ohci: new USB bus registered, assigned bus number 2
[    1.680002] ambarella-ohci e0008000.ohci: irq 26, io mem 0xe0008000
[    1.742371] usb usb2: New USB device found, idVendor=1d6b, idProduct=0001
[    1.749143] usb usb2: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.756344] usb usb2: Product: Ambarella OHCI
[    1.760684] usb usb2: Manufacturer: Linux 4.14.183 ohci_hcd
[    1.766695] usb usb2: SerialNumber: AmbUSB
[    1.771032] hub 2-0:1.0: USB hub found
[    1.774785] hub 2-0:1.0: 1 port detected
[    1.778987] usbcore: registered new interface driver usbserial
[    1.784824] usbcore: registered new interface driver usbserial_generic
[    1.791351] usbserial: USB Serial support registered for generic
[    1.797391] ambarella-udc e0006000.udc: ambarella_udc: version 21 Jan 2016
[    1.807601] rtc rtc0: invalid alarm value: 1970-1-1 0:0:0
[    1.813070] ambarella-rtc ec001000.rtc: rtc core: registered ec001000.rtc as rtc0
[    1.820535] ambarella-rtc ec001000.rtc: Warning: RTC lost power.....
[    1.826972] i2c /dev entries driver
[    1.830898] ambarella-wdt ec002000.wdt: Ambarella Watchdog Timer Probed.
[    2.309315] ambarella-sd e0005000.sdmmc0: Max frequency is 120000000Hz
[    2.370314] ambarella-sd e0004000.sdmmc1: Max frequency is 25945946Hz
[    2.376807] optee: probing for conduit method from DT.
[    2.382119] optee: initialized driver
[    2.396820] Netfilter messages via NETLINK v0.30.
[    2.401693] ipip: IPv4 and MPLS over IPv4 tunneling driver
[    2.407484] ip_tables: (C) 2000-2006 Netfilter Core Team
[    2.438650] Initializing XFRM netlink socket
[    2.443307] NET: Registered protocol family 10
[    2.448316] Segment Routing with IPv6
[    2.452009] ip6_tables: (C) 2000-2006 Netfilter Core Team
[    2.457544] sit: IPv6, IPv4 and MPLS over IPv4 tunneling driver
[    2.463763] NET: Registered protocol family 17
[    2.468230] Bridge firewalling registered
[    2.472230] 8021q: 802.1Q VLAN Support v1.8
[    2.476427] Key type dns_resolver registered
[    2.482157] Btrfs loaded, crc32c=crc32c-generic
[    2.488107] console [netcon0] enabled
[    2.491760] netconsole: network logging started
[    2.511200] ambarella-rtc ec001000.rtc: setting system clock to 2000-01-01 00:05:01 UTC (946685101)
[    2.520372] ALSA device list:
[    2.523324]   No soundcards found.
[    2.526930] RAMDISK: squashfs filesystem found at block 0
[    2.532320] RAMDISK: Loading 32285KiB [1 disk] into ram disk... -
[    2.639479] \
[    2.749068] |
[    2.812265] mmc1: new MMC card at address 0001
[    2.858552] |
[    2.863276] mmcblk1: mmc1:0001 8GTF4R 3.64 GiB
[    2.863277] -
[    2.865587] mmcblk1boot0: mmc1:0001 8GTF4R partition 1 4.00 MiB
[    2.870065] \
[    2.871901] mmcblk1boot1: mmc1:0001 8GTF4R partition 2 4.00 MiB
[    2.877783] |
[    2.879438] mmcblk1rpmb: mmc1:0001 8GTF4R partition 3 512 KiB, chardev (249:0)
[    2.885339] /
[    2.887155]  mmcblk1: p1(linux) p2(kernel0) p3(kernel1) p4(rootfs0) p5(rootfs1) p6(defconf0) p7(defconf1) p8(flashfs) p9(flashfs2) p10(backup)
[    2.894175] -
[    3.018106] \
[    3.127847] /
[    3.132762] done.
[    3.255454] VFS: Mounted root (squashfs filesystem) readonly on device 1:0.
[    3.262694] Freeing unused kernel memory: 384K
check pid: CV2-IMX335-SC9133-202006c
mount: mounting /dev/mmcblk1-flash on /mnt/flash.raw failed: Invalid argument
mount /mnt/flash.raw failed!
mke2fs 1.42.8 (20-Jun-2013)
ext2fs_check_if_mount: Can't check if filesystem is mounted due to missing mtab file while determining whether /dev/mmcblk1-flash is mounted.
Discarding device blocks: done
[    5.700917] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
[    5.707721] random: mkfs.ext4: uninitialized urandom read (16 bytes read)
Filesystem label=
OS type: Linux
Block size=1024 (log=0)
Fragment size=1024 (log=0)
Stride=0 blocks, Stripe width=0 blocks
8192 inodes, 32768 blocks
1638 blocks (5.00%) reserved for the super user
First data block=1
Maximum filesystem blocks=33554432
4 block groups
8192 blocks per group, 8192 fragments per group
2048 inodes per group
Superblock backups stored on blocks:
        8193, 24577

Allocating group tables: done
Writing inode tables: done
Creating journal (4096 blocks): done
Writing superblocks and filesystem accounting information: done

[    6.015125] random: fast init done
[    6.019861] EXT4-fs (mmcblk1p8): mounted filesystem with ordered data mode. Opts: (null)
mount /mnt/flash.raw successfully!
mount flash failed!
rebuild flash
[    9.444410] random: encfs: uninitialized urandom read (32 bytes read)
mount flash successfully!
[   10.139030] EXT4-fs (mmcblk1p9): recovery complete
[   10.144433] EXT4-fs (mmcblk1p9): mounted filesystem with ordered data mode. Opts: (null)
mount /mnt/flash2.raw successfully!
[   10.199031] random: encfs: uninitialized urandom read (32 bytes read)
mount flash2 successfully!
[   10.738674] gpioc: loading out-of-tree module taints kernel.
[   10.744661] GPIO Device Driver version 1.0.0.2
update system configuration...
Set boot partition successfully!
except options... &
[   10.997336] EXT4-fs (mmcblk1p6): mounted filesystem with ordered data mode. Opts: (null)
[   12.987186] random: crng init done
-rw-r--r--    1 root     root          5672 Jan  1 00:05 config_vadpinfo.xml
insmod: can't insert '/drivers/gpioc.ko': File exists
Stopping led: .
Starting led: .
Starting configer: .
Starting authmgr: [SWTDLIB][src/swatchdoglib.c:0171]: ERROR: Connect socket fail (2:No such file or directory)
.
[   21.366086] EXT4-fs (mmcblk1p10): recovery complete
[   21.371468] EXT4-fs (mmcblk1p10): mounted filesystem with ordered data mode. Opts: (null)
mount /mnt/backup.raw successfully!
mount backup successfully!
tar: can't open '/mnt/backup/config.tar.gz': No such file or directory
tar config.tar.gz failed!
Open /tmp/config/uservalue.xml~ failed: No such file or directory
Open /tmp/config/uservalue.xml~ failed: No such file or directory
Open /tmp/config/uservalue.xml~ failed: No such file or directory
0
/usr/bin/update_etc: line 484: /usr/bin/update_privilege: not found
sed: /tmp/config/group: No such file or directory
sed: /tmp/config/group: No such file or directory
sed: /tmp/config/group: No such file or directory
cp: can't stat '/tmp/config/passwd': No such file or directory
cp: can't stat '/tmp/config/group': No such file or directory
cp: can't stat '/tmp/config/sudoers': No such file or directory
cp: can't stat '/tmp/config/services': No such file or directory
cp: can't stat '/tmp/config/ssapivov': No such file or directory
cp: can't stat '/tmp/config/statusfile': No such file or directory
cp: can't stat '/tmp/config/config_onvifdiscovery.xml': No such file or directory
cp: can't stat '/tmp/config/task': No such file or directory
cp: can't stat '/tmp/config/ssl': No such file or directory
cp: can't stat '/tmp/config/config_onvif': No such file or directory
cp: can't stat '/tmp/config/vadp-enabled': No such file or directory
cp: can't stat '/tmp/config/avahi/*': No such file or directory
cp: can't stat '/tmp/config/ssh': No such file or directory
cp: can't stat '/tmp/config/config_dst.xml': No such file or directory
cp: can't stat '/tmp/config/certificate.info': No such file or directory
cp: can't stat '/tmp/config/privatekey.pem': No such file or directory
cp: can't stat '/tmp/config/publickey.cert': No such file or directory
cp: can't stat '/tmp/config/publickey.req': No such file or directory
cp: can't stat '/tmp/config/remotefocusd': No such file or directory
cp: can't stat '/tmp/config/zfsys': No such file or directory
Not found private key
.
ip address is 192.168.0.99
resetip is 1
Stopping snmpd: killall: snmpd: no process killed
.
Starting ddnsc: DDNS client is disabled
Reloading configuration syslogd: .
config file parse OK!!
Shared Memory 1 get nothing?
Attach SharedMemBlock failed!
end
config file parse OK!!
Shared Memory 2 get nothing?
Attach SharedMemBlock failed!
end
open fdFIFO fail, errno=2
open fdFIFO fail, errno=2
open fdFIFO fail, errno=2
open fdFIFO fail, errno=2
open fdFIFO fail, errno=2
open fdFIFO fail, errno=2
cat: can't open '/var/run/venc.pid': No such file or directory
sh: you need to specify whom to kill
killall: serverpush: no process killed
network_rtsp_s0_audiotrack=0
network_rtsp_s1_audiotrack=0
network_rtsp_s2_audiotrack=0
Stopping rtsps: .
rm: can't remove '/var/run/rtsps.pid': No such file or directory
.
[SessionMgr_CreateConnFile] Create File /var/run/sessioninfo fd 3 ptr 0x3253c280 inode 4135 iWriteNum 81 iResult 0
[sessmgr] : Update debug level to 6:LOG_INFO FIX=4 ANT=0
/etc/init.d/rtsps: line 51: can't create /var/run/ss/conninfo: nonexistent directory
Starting rtsps: run as daemon mode
Stopping : .
rm: can't remove '/var/run/storm.pid': No such file or directory
.
Starting : open fdFIFO fail, errno=2
Starting upnpdd: cat: can't open '/var/run/stormgr.pid': No such file or directory
sh: you need to specify whom to kill
onvif_deviceinfo_hardwareid=1.3f
grep: /etc/conf.d/config_onvifdiscovery.xml: No such file or directory
sh: 0: unknown operand
grep: /etc/conf.d/config_onvifdiscovery.xml: No such file or directory
enable 1
sh: 0: unknown operand
.
sh: 0: unknown operand
grep: /etc/conf.d/config_onvif/config_onvif_media_profile.xml: No such file or directory
sh: 0: unknown operand
grep: /etc/conf.d/config_onvif/config_onvif_media_profile.xml: No such file or directory
sh: 0: unknown operand
Reloading configuration httpd: .
Reloading configuration httpd: .
Reloading configuration httpd: .
Reloading configuration httpd: .
Reloading configuration httpd: .
Reloading configuration httpd: .
https_connect=8080
Stopping stunnel: .
ifconfig: wlan0: error fetching interface information: Device not found
Reloading configuration httpd: .
Update GID: ok
Starting chronos: .
Remounting /mnt/flash2 to async mode
Remounting /mnt/flash2.raw to async mode
[   29.233352] EXT4-fs (mmcblk1p9): re-mounted. Opts: data=ordered
ls: /mnt/flash2/vadp-preload/: No such file or directory
Reloading configuration httpd: .

File system disk space usage
Filesystem            Size      Used Available Use% Mounted on
/dev/mmcblk1-flash2       1.9G     76.2M      1.7G   4% /mnt/flash2.raw
encfs                     1.9G     76.2M      1.7G   4% /mnt/flash2
******************************************
    Start to upgrade preload package
******************************************
Preload package Size: 70.0M
Untar package Size: 73.9M
Support this platform.
VCA Preload Package Version: 6.18.0.1-3f
ok
ok
chmod: /tmp/gsensor_sharefile_c0: No such file or directory
cat: can't open '/proc/umap/ive': No such file or directory
find: /mnt/flash2/logs/*: No such file or directory
Update configuration...
Update configuration successfully
Reloading configuration httpd: .

File system disk space usage
Upgrade   Filesystem             Size      Used Available Use% Mounted on
Before    /dev/mmcblk1-flash2       1.9G      6.2M      1.8G   0% /mnt/flash2.raw
encfs                     1.9G      6.2M      1.8G   0% /mnt/flash2
After     /dev/mmcblk1-flash2       1.9G     80.3M      1.7G   4% /mnt/flash2.raw
encfs                     1.9G     80.3M      1.7G   4% /mnt/flash2
File space usage:
Upgrade   Size     Path
Before    0
After     74.1M    /mnt/flash2/vadp/0
Upgrade preload VCA package successfully

Preload package Size: 3.2M
Untar package Size: 8.7M
Device Center Preload Package Version: 1.1.8.1-3e
ok
ok
touch: /mnt/flash2/vadp/1/logs/initScript.log: No such file or directory
/mnt/flash2/vadp/1/main.sh: line 193: can't open /mnt/flash2/vadp/1/logs/initScript.log: no such file
sh: 1000000: unknown operand
/mnt/flash2/vadp/1/main.sh: line 198: can't create /mnt/flash2/vadp/1/logs/initScript.log: nonexistent directory
install
Update configuration...
Update configuration successfully
Reloading configuration httpd: .

File system disk space usage
Upgrade   Filesystem             Size      Used Available Use% Mounted on
Before    /dev/mmcblk1-flash2       1.9G     77.1M      1.7G   4% /mnt/flash2.raw
encfs                     1.9G     77.1M      1.7G   4% /mnt/flash2
After     /dev/mmcblk1-flash2       1.9G     85.8M      1.7G   5% /mnt/flash2.raw
encfs                     1.9G     85.8M      1.7G   5% /mnt/flash2
File space usage:
Upgrade   Size     Path
Before    0
After     8.7M    /mnt/flash2/vadp/1
Upgrade preload Device Center package successfully

******************************************
    Upgrade preload package end
******************************************
File system disk space usage
Filesystem            Size      Used Available Use% Mounted on
/dev/mmcblk1-flash2       1.9G     85.8M      1.7G   5% /mnt/flash2.raw
encfs                     1.9G     85.8M      1.7G   5% /mnt/flash2
Remounting /mnt/flash2 to sync mode
Remounting /mnt/flash2.raw to sync mode
[   59.224371] EXT4-fs (mmcblk1p9): re-mounted. Opts: data=ordered
Consumed 30 sec for uploading package
Starting authmgr: .
ok
"flashstatus" write successfully!
Change flash status from 0 to 250
stat: can't stat '/mnt/flash2/log/messages_system': No such file or directory
sh: 32768: unknown operand
The system is going down NOW!
Sent SIGTERM to all processes
[   62.545844] watchdog: watchdog0: watchdog did not stop!
Sent SIGKILL to all processes
Requesting system reboot
[   63.571669] ambarella-wdt ec002000.wdt: ambarella_wdt_shutdown @ 5.
[   63.577987] reboot: Restarting system

NOTICE:  BL2: v2.1(release):fc60887-dirty
NOTICE:  BL2: Built : 12:17:27, Jan  3 2022
NOTICE:  ROTPK is not deployed on platform. Skipping ROTPK verification.
NOTICE:  BL2: Booting BL31

NOTICE:  BL31: Secure code at 0x100000
NOTICE:  BL31: Cleanup auto recovery request
NOTICE:  BL31: Non Secure code at 0x1400000
NOTICE:  BL31: v2.1(release):fc60887-dirty
NOTICE:  BL31: Built : 12:17:27, Jan  3 2022
NOTICE:  Stage2 Translation reserved 0xc00000

Debug Mode: Y (sysparam)
  __      _   _____  __      _    ____     _______   ______    _   _
  \ \    / / |_   _| \ \    / /  / __ \   |__   __| |  ____|  | | / /
   \ \  / /    | |    \ \  / /  / /  \ \     | |    | |____   | |/ /
    \ \/ /     | |     \ \/ /  | |    | |    | |    |  ____|  |   \
     \  /     _| |_     \  /    \ \__/ /     | |    | |____   | |\ \
      \/     |_____|     \/      \____/      |_|    |______|  |_| \_\

Target platform: VVTK_SC9133S88V13 (20201127)

Get ptb failed!
auto boot......


amboot-dirty (Jan 03 2022 - 12:17:21) (DLL VALUE = 0x071f02)


S/N:
usbdl_mode: 0
auto_boot: 1
bootcmd:

===== Boot from SD =====
No card detected in SD slots

===== Boot from EMMC =====
Boot partition = 1
Read normal kernel and dtb
   Read mkimage from EMMC 00100000 to DRAM 0167ffc0
   Image Name:   linux-4.14
   Image Type:   ARM Linux Kernel Image (uncompressed)
   Data Size:    11327760 Bytes = 10.8 MB
   Load Address: 00280000
   Entry Point:  00280000
   Verifying Checksum ... OK
   Verifying Signature ... OK
   Decrypt Ciphertext ... OK
   Read mkimage from EMMC 00bcda00 to DRAM 02507fc0
   Image Name:   linux-4.14
   Image Type:   ARM Linux Kernel Image (uncompressed)
   Data Size:    36416 Bytes = 35.6 kB
   Load Address: 00a08000
   Entry Point:  00a08000
   Verifying Checksum ... OK
   Verifying Signature ... OK
   Decrypt Ciphertext ... OK
Read normal rootfs
   Read mkimage from EMMC 08100000 to DRAM 02607fc0
   Image Name:   Rootfs
   Image Type:   ARM Linux Filesystem Image (uncompressed)
   Data Size:    33063184 Bytes = 31.5 MB
   Load Address: 02ffffc0
   Entry Point:  03000000
   Verifying Checksum ... OK
   Verifying Signature ... OK
   Decrypt Ciphertext ... OK
rmd image absent... skipping
Jumping to 0x01680000 ...
SOC signed DTB (RO).
SOC signed DTB (RO).
cpux_jump: 0x01400148
cmdline:
initrd2_start: 0x00000000 initrd2_size: 0x00000000
kernelp: 0x01600000 kernels: 0x7ea00000
iavp: 0x37800000 iavs: 0x48800000
fbp: 0x37800000 fbs: 0x00000000
dtbp: 0x37700000
[    0.000000] Booting Linux on physical CPU 0x0
[    0.000000] Linux version 4.14.183 (chewei.lin@rd1-5) (gcc version 8.2.1 20180802 (Linaro GCC 8.2-2018.08~dev)) #8 SMP PREEMPT Mon Jan 3 12:18:29 CST 2022
[    0.000000] Boot CPU: AArch64 Processor [410fd034]
[    0.000000] Machine model: Ambarella CV2BUB Board
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000034400000, size 48 MiB
[    0.000000] OF: reserved mem: initialized node linux,cma, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000037800000, size 644 MiB
[    0.000000] OF: reserved mem: initialized node iav@0x37800000, compatible id shared-dma-pool
[    0.000000] Reserved memory: created CMA memory pool at 0x0000000060000000, size 508 MiB
[    0.000000] OF: reserved mem: initialized node cavalry@0x60000000, compatible id shared-dma-pool
[    0.000000] psci: probing for conduit method from DT.
[    0.000000] psci: PSCIv1.1 detected in firmware.
[    0.000000] psci: Using standard PSCI v0.2 function IDs
[    0.000000] psci: Trusted OS migration not required
[    0.000000] psci: SMC Calling Convention v1.1
[    0.000000] percpu: Embedded 19 pages/cpu s38680 r8192 d30952 u77824
[    0.000000] Detected VIPT I-cache on CPU0
[    0.000000] CPU features: enabling workaround for ARM erratum 845719
[    0.000000] Speculative Store Bypass Disable mitigation not required
[    0.000000] Built 1 zonelists, mobility grouping on.  Total pages: 510552
[    0.000000] Kernel command line: console=ttyS0 root=/dev/ram0 ro rootfstype=squashfs initrd=0x2608000,40M ramdisk_size=320000 blkdevparts=mmcblk1:4G@0(linux),64M@0x100000(kernel0),64M@0x4100000(kernel1),240M@0x8100000(rootfs0),240M@0x17100000(rootfs1),8M@0x26100000(defconf0),8M@0x26900000(defconf1),32M@0x27100000(flashfs),2048M@0x29100000(flashfs2),1023M@0xA9100000(backup) user_debug=31
[    0.000000] PID hash table entries: 4096 (order: 3, 32768 bytes)
[    0.000000] Dentry cache hash table entries: 262144 (order: 9, 2097152 bytes)
[    0.000000] Inode-cache hash table entries: 131072 (order: 8, 1048576 bytes)
[    0.000000] Memory: 757064K/2074624K available (7998K kernel code, 630K rwdata, 2032K rodata, 384K init, 260K bss, 88760K reserved, 1228800K cma-reserved)
[    0.000000] Virtual kernel memory layout:
[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbebfff0000   (   250 GB)
[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008850000   (  8000 KB)
[    0.000000]     .rodata : 0xffffff8008850000 - 0xffffff8008a50000   (  2048 KB)
[    0.000000]       .init : 0xffffff8008a50000 - 0xffffff8008ab0000   (   384 KB)
[    0.000000]       .data : 0xffffff8008ab0000 - 0xffffff8008b4d808   (   631 KB)
[    0.000000]        .bss : 0xffffff8008b4d808 - 0xffffff8008b8e890   (   261 KB)
[    0.000000]     fixed   : 0xffffffbefe7fb000 - 0xffffffbefec00000   (  4116 KB)
[    0.000000]     PCI I/O : 0xffffffbefee00000 - 0xffffffbeffe00000   (    16 MB)
[    0.000000]     vmemmap : 0xffffffbf00000000 - 0xffffffc000000000   (     4 GB maximum)
[    0.000000]               0xffffffbf00058000 - 0xffffffbf02000000   (    31 MB actual)
[    0.000000]     memory  : 0xffffffc001600000 - 0xffffffc080000000   (  2026 MB)
[    0.000000] SLUB: HWalign=64, Order=0-3, MinObjects=0, CPUs=4, Nodes=1
[    0.000000] Preemptible hierarchical RCU implementation.
[    0.000000]  Tasks RCU enabled.
[    0.000000] NR_IRQS: 64, nr_irqs: 64, preallocated irqs: 0
[    0.000000] CPU features: GIC system register CPU interface present but disabled by higher exception level
[    0.000000] arch_timer: cp15 timer(s) running at 63.00MHz (virt).
[    0.000000] clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0xe879c5e9b, max_idle_ns: 440795204668 ns
[    0.000004] sched_clock: 56 bits at 63MHz, resolution 15ns, wraps every 2199023255548ns
[    0.000198] Console: colour dummy device 80x25
[    0.350805] console [ttyS0] enabled
[    0.354284] Calibrating delay loop (skipped), value calculated using timer frequency.. 126.00 BogoMIPS (lpj=63000)
[    0.364605] pid_max: default: 32768 minimum: 301
[    0.369288] Mount-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.375980] Mountpoint-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.387145] ASID allocator initialised with 32768 entries
[    0.394543] Hierarchical SRCU implementation.
[    0.403920] smp: Bringing up secondary CPUs ...
[    0.415583] Detected VIPT I-cache on CPU1
[    0.419602] CPU1: Booted secondary processor [410fd034]
[    0.431635] Detected VIPT I-cache on CPU2
[    0.435639] CPU2: Booted secondary processor [410fd034]
[    0.447713] Detected VIPT I-cache on CPU3
[    0.451717] CPU3: Booted secondary processor [410fd034]
[    0.456975] smp: Brought up 1 node, 4 CPUs
[    0.461063] SMP: Total of 4 processors activated.
[    0.465751] CPU features: detected: 32-bit EL0 Support
[    0.471340] CPU: All CPU(s) started at EL1
[    0.475431] alternatives: patching kernel code
[    0.480855] devtmpfs: initialized
[    0.488845] random: get_random_u32 called from bucket_table_alloc+0x108/0x268 with crng_init=0
[    0.497744] clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 1911260446275000 ns
[    0.507467] futex hash table entries: 1024 (order: 5, 131072 bytes)
[    0.546775] xor: measuring software checksum speed
[    0.561611]    8regs     :  1996.000 MB/sec
[    0.575811]    8regs_prefetch:  1724.000 MB/sec
[    0.590355]    32regs    :  2288.000 MB/sec
[    0.604554]    32regs_prefetch:  1940.000 MB/sec
[    0.609150] xor: using function: 32regs (2288.000 MB/sec)
[    0.614533] pinctrl core: initialized pinctrl subsystem
[    0.620028] NET: Registered protocol family 16
[    0.625091] vdso: 2 pages (1 code @ ffffff8008855000, 1 data @ ffffff8008ab4000)
[    0.638988] DMA: preallocated 256 KiB pool for atomic allocations
[    0.647805] ambarella-pinctrl ec003000.pinctrl: Ambarella pinctrl driver registered
[    0.656059] ambarella-gpio ec003000.pinctrl:gpio@0: Ambarella GPIO driver registered
[    0.669765] HugeTLB registered 2.00 MiB page size, pre-allocated 0 pages
[    0.693671] raid6: int64x1  gen()   382 MB/s
[    0.715009] raid6: int64x1  xor()   378 MB/s
[    0.736413] raid6: int64x2  gen()   589 MB/s
[    0.757793] raid6: int64x2  xor()   503 MB/s
[    0.779141] raid6: int64x4  gen()   839 MB/s
[    0.800493] raid6: int64x4  xor()   619 MB/s
[    0.821840] raid6: int64x8  gen()   988 MB/s
[    0.843184] raid6: int64x8  xor()   638 MB/s
[    0.864535] raid6: neonx1   gen()   632 MB/s
[    0.885877] raid6: neonx1   xor()   740 MB/s
[    0.907246] raid6: neonx2   gen()   972 MB/s
[    0.928601] raid6: neonx2   xor()   990 MB/s
[    0.949953] raid6: neonx4   gen()  1285 MB/s
[    0.971299] raid6: neonx4   xor()  1203 MB/s
[    0.992668] raid6: neonx8   gen()  1316 MB/s
[    1.014018] raid6: neonx8   xor()  1236 MB/s
[    1.018268] raid6: using algorithm neonx8 gen() 1316 MB/s
[    1.023644] raid6: .... xor() 1236 MB/s, rmw enabled
[    1.028587] raid6: using neon recovery algorithm
[    1.033837] ambarella-dma e000a000.dma: Ambarella DMA Engine
[    1.040016] ambarella-dma e000b000.dma: Ambarella DMA Engine
[    1.045966] usbcore: registered new interface driver usbfs
[    1.051463] usbcore: registered new interface driver hub
[    1.056793] usbcore: registered new device driver usb
[    1.062143] ambarella-i2c e4008000.i2c: Ambarella I2C adapter[0] probed, clock:100000!
[    1.070256] ambarella-i2c e4009000.i2c: Ambarella I2C adapter[1] probed, clock:100000!
[    1.078318] Advanced Linux Sound Architecture Driver Initialized.
[    1.085581] clocksource: Switched to clocksource arch_sys_counter
[    1.096295] NET: Registered protocol family 2
[    1.100977] TCP established hash table entries: 16384 (order: 5, 131072 bytes)
[    1.108303] TCP bind hash table entries: 16384 (order: 6, 262144 bytes)
[    1.115118] TCP: Hash tables configured (established 16384 bind 16384)
[    1.121728] UDP hash table entries: 1024 (order: 3, 32768 bytes)
[    1.127759] UDP-Lite hash table entries: 1024 (order: 3, 32768 bytes)
[    1.134323] NET: Registered protocol family 1
[    1.138906] RPC: Registered named UNIX socket transport module.
[    1.144821] RPC: Registered udp transport module.
[    1.149509] RPC: Registered tcp transport module.
[    1.154196] RPC: Registered tcp NFSv4.1 backchannel transport module.
[    1.160737] Trying to unpack rootfs image as initramfs...
[    1.166256] rootfs image is not initramfs (junk in compressed archive); looks like an initrd
[    1.254900] Freeing initrd memory: 40960K
[    1.261993] workingset: timestamp_bits=62 max_order=19 bucket_order=0
[    1.272736] squashfs: version 4.0 (2009/01/31) Phillip Lougher
[    1.279424] fuse init (API version 7.26)
[    1.283613] SGI XFS with security attributes, no debug enabled
[    1.293073] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 250)
[    1.300452] io scheduler noop registered
[    1.304362] io scheduler deadline registered
[    1.308687] io scheduler cfq registered (default)
[    1.313378] io scheduler mq-deadline registered
[    1.317891] io scheduler kyber registered
[    1.323113] ambarella-gdma e000c000.gdma: Ambarella GDMA driver init
[    1.329721] e4000000.uart: ttyS0 at MMIO 0xe4000000 (irq = 11, base_baud = 1500000) is a ambuart
[    1.338736] e0016000.uart: ttyS1 at MMIO 0xe0016000 (irq = 32, base_baud = 1500000) is a ambuart
[    1.347724] e0017000.uart: ttyS2 at MMIO 0xe0017000 (irq = 33, base_baud = 1500000) is a ambuart
[    1.356738] cacheinfo: Unable to detect cache hierarchy for CPU 0
[    1.363325] brd: module loaded
[    1.370855] loop: module loaded
[    1.374069] Ambarella read-only mtdblock
[    1.378300] libphy: Fixed MDIO Bus: probed
[    1.382494] tun: Universal TUN/TAP device driver, 1.6
[    1.503588] libphy: Ambarella MDIO Bus: probed
[    1.509454] ambarella-eth e000e000.ethernet: Enhance Ethernet PHY[1]: 0x02430c54!
[    1.517232] ambarella-eth e000e000.ethernet: CONFIG_PTP_1588_CLOCK is not set
[    1.524355] ambarella-eth e000e000.ethernet: MAC Address[46:a4:95:9d:76:74].
[    1.531432] PPP generic driver version 2.4.2
[    1.535770] PPP BSD Compression module registered
[    1.540463] PPP Deflate Compression module registered
[    1.545522] PPP MPPE Compression module registered
[    1.550298] NET: Registered protocol family 24
[    1.554738] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    1.561254] ehci-ambarella: AMBARELLA-EHCI Host Controller driver
[    1.567422] ambarella-ehci e0009000.ehci: EHCI Host Controller
[    1.573252] ambarella-ehci e0009000.ehci: new USB bus registered, assigned bus number 1
[    1.581748] ambarella-ehci e0009000.ehci: irq 27, io mem 0xe0009000
[    1.594591] ambarella-ehci e0009000.ehci: USB 2.0 started, EHCI 1.00
[    1.601056] usb usb1: New USB device found, idVendor=1d6b, idProduct=0002
[    1.607828] usb usb1: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.615030] usb usb1: Product: EHCI Host Controller
[    1.619891] usb usb1: Manufacturer: Linux 4.14.183 ehci_hcd
[    1.625445] usb usb1: SerialNumber: AmbUSB
[    1.629828] hub 1-0:1.0: USB hub found
[    1.633588] hub 1-0:1.0: 1 port detected
[    1.637756] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    1.643995] ambarella-ohci e0008000.ohci: Ambarella OHCI
[    1.649301] ambarella-ohci e0008000.ohci: new USB bus registered, assigned bus number 2
[    1.657313] ambarella-ohci e0008000.ohci: irq 26, io mem 0xe0008000
[    1.719685] usb usb2: New USB device found, idVendor=1d6b, idProduct=0001
[    1.726457] usb usb2: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    1.733658] usb usb2: Product: Ambarella OHCI
[    1.737999] usb usb2: Manufacturer: Linux 4.14.183 ohci_hcd
[    1.743553] usb usb2: SerialNumber: AmbUSB
[    1.748266] hub 2-0:1.0: USB hub found
[    1.752019] hub 2-0:1.0: 1 port detected
[    1.756223] usbcore: registered new interface driver usbserial
[    1.762060] usbcore: registered new interface driver usbserial_generic
[    1.768593] usbserial: USB Serial support registered for generic
[    1.774633] ambarella-udc e0006000.udc: ambarella_udc: version 21 Jan 2016
[    1.783919] rtc rtc0: invalid alarm value: 1970-1-1 0:0:0
[    1.789388] ambarella-rtc ec001000.rtc: rtc core: registered ec001000.rtc as rtc0
[    1.796853] ambarella-rtc ec001000.rtc: Warning: RTC lost power.....
[    1.803290] i2c /dev entries driver
[    1.807214] ambarella-wdt ec002000.wdt: Ambarella Watchdog Timer Probed.
[    2.283629] ambarella-sd e0005000.sdmmc0: Max frequency is 120000000Hz
[    2.344630] ambarella-sd e0004000.sdmmc1: Max frequency is 25945946Hz
[    2.351121] optee: probing for conduit method from DT.
[    2.356438] optee: initialized driver
[    2.361248] Netfilter messages via NETLINK v0.30.
[    2.366076] ipip: IPv4 and MPLS over IPv4 tunneling driver
[    2.371892] ip_tables: (C) 2000-2006 Netfilter Core Team
[    2.398665] Initializing XFRM netlink socket
[    2.403289] NET: Registered protocol family 10
[    2.408288] Segment Routing with IPv6
[    2.411986] ip6_tables: (C) 2000-2006 Netfilter Core Team
[    2.417534] sit: IPv6, IPv4 and MPLS over IPv4 tunneling driver
[    2.423763] NET: Registered protocol family 17
[    2.428230] Bridge firewalling registered
[    2.432237] 8021q: 802.1Q VLAN Support v1.8
[    2.436442] Key type dns_resolver registered
[    2.442164] Btrfs loaded, crc32c=crc32c-generic
[    2.448112] console [netcon0] enabled
[    2.451770] netconsole: network logging started
[    2.480526] ambarella-rtc ec001000.rtc: setting system clock to 2000-01-01 00:06:10 UTC (946685170)
[    2.489708] ALSA device list:
[    2.492671]   No soundcards found.
[    2.496284] RAMDISK: squashfs filesystem found at block 0
[    2.501683] RAMDISK: Loading 32285KiB [1 disk] into ram disk... -
[    2.608599] \
[    2.717655] |
[    2.769593] mmc1: new MMC card at address 0001
[    2.826798] /
[    2.831543] mmcblk1: mmc1:0001 8GTF4R 3.64 GiB
[    2.831640] -
[    2.834021] mmcblk1boot0: mmc1:0001 8GTF4R partition 1 4.00 MiB
[    2.838496] \
[    2.840168] mmcblk1boot1: mmc1:0001 8GTF4R partition 2 4.00 MiB
[    2.846045] |
[    2.853567] mmcblk1rpmb: mmc1:0001 8GTF4R partition 3 512 KiB, chardev (249:0)
[    2.853658] -
[    2.862623]  mmcblk1: p1(linux) p2(kernel0) p3(kernel1) p4(rootfs0) p5(rootfs1) p6(defconf0) p7(defconf1) p8(flashfs) p9(flashfs2) p10(backup)
[    2.862641] \
[    2.986504] |
[    3.095827] /
[    3.100613] done.
[    3.223088] VFS: Mounted root (squashfs filesystem) readonly on device 1:0.
[    3.230314] Freeing unused kernel memory: 384K
check pid: CV2-IMX335-SC9133-202006c
[    5.564020] EXT4-fs (mmcblk1p8): recovery complete
[    5.569500] EXT4-fs (mmcblk1p8): mounted filesystem with ordered data mode. Opts: (null)
mount /mnt/flash.raw successfully!
[    8.966566] random: encfs: uninitialized urandom read (32 bytes read)
mount flash successfully!
[    9.580569] random: fast init done
[    9.684977] EXT4-fs (mmcblk1p9): recovery complete
[    9.690329] EXT4-fs (mmcblk1p9): mounted filesystem with ordered data mode. Opts: (null)
mount /mnt/flash2.raw successfully!
[    9.746077] random: encfs: uninitialized urandom read (32 bytes read)
mount flash2 successfully!
[   10.376149] gpioc: loading out-of-tree module taints kernel.
[   10.382072] GPIO Device Driver version 1.0.0.2
/etc exist
Build fifo for media
Starting automount: [   10.937421] random: taskgen: uninitialized urandom read (8 bytes read)
.
kernel.msgmnb = 65536
vm.dirty_ratio = 1
vm.dirty_background_ratio = 1
vm.min_free_kbytes = 4096
vm.vfs_cache_pressure = 163
net.ipv4.tcp_timestamps = 0
vm.panic_on_oom = 2
kernel.panic = 1
.sys.module.cifs.parameters.enable_oplocks = 0
check apply_patch_before
"flashstatus" write successfully!
run-parts -a start /etc/rcS.d
[   11.270120] !!!DANGEROUS!!! You must know what you are doning!
sh: Y: unknown operand
[   11.395173] platform iav:ambcma: assigned reserved memory node iav@0x37800000
[   11.748434] imgproc: module license 'Proprietary' taints kernel.
[   11.754453] Disabling lock debugging due to kernel taint
[   11.914549] ++++clk:37125000+++
[   11.961019] amba_debug_init 247:0.
map_size = 0x500000, nr_item = 4
addr_offset = 0x00000000, filename = orccode.bin
addr_offset = 0x00300000, filename = orcme.bin
addr_offset = 0x003a0000, filename = orcmdxf.bin
addr_offset = 0x003e0000, filename = default_binary.bin
mmap returns 0x7fbc27f000
loading /lib/firmware/orccode.bin...addr = 0x7fbc27f000, size = 0x225b18
loading /lib/firmware/orcme.bin...addr = 0x7fbc57f000, size = 0x42894
loading /lib/firmware/orcmdxf.bin...addr = 0x7fbc61f000, size = 0x28ed0
loading /lib/firmware/default_binary.bin...addr = 0x7fbc65f000, size = 0x6ce84
===============================================
ucode (CV2) version = 2021/1/22 289139.289099
===============================================
[   12.516256] cavalry sub_scheduler0: assigned reserved memory node cavalry@0x60000000
map_cavalry: phys: 0x60400000, virt: 0x7faa632000, total size: 0x100000
Cavalry Ucode Version = CV25-Ver.102-20200615-3f1e303e-hl_fw.00000001
[   12.594895] vco = 384000000, 24000000, 1, 16, 1
[   12.601592] vco = 792000000, 24000000, 1, 33, 1
No equip light sensor
adj_params/
adj_params/imx335_liso_adj_param.bin
adj_params/imx335_aeb_param.bin
adj_params/imx335_hdr_liso_adj_param.bin
adj_params/imx335_hdr_aliso_adj_param.bin
adj_params/yuv_input_aeb_param.bin
adj_params/yuv_input_aliso_adj_param.bin
adj_params/imx335_aliso_adj_param.bin
adj_params/yuv_input_liso_adj_param.bin
reg.bin
sensors/
sensors/imx335_03_3D.bin
sensors/imx335_01_3D.bin
sensors/imx335_02_3D_hdr.bin
sensors/imx335_03_3D_hdr.bin
sensors/imx335_04_3D.bin
sensors/imx335_04_3D_hdr.bin
sensors/imx335_02_3D.bin
sensors/imx335_01_3D_hdr.bin
sensors/yuv_input_3D.bin
yuv_input_reg.bin
install icr driver.
[   12.869038] ICR Device Driver version 1.0.0.2
[   14.210636] usbcore: registered new interface driver rtl8192eu
[   14.920127] usbcore: registered new interface driver rtl8192fu
Starting led: [   15.462397] random: led: uninitialized urandom read (8 bytes read)
[   15.469004] random: led: uninitialized urandom read (8 bytes read)
[   15.475705] random: led: uninitialized urandom read (8 bytes read)
.
Starting restore: .
Starting configer: .
Starting shm_allocate: .
Starting vadpshmalloc: .
Starting swatchdog: .
Starting chronos: .
Starting radvdump: .
Starting /etc/rcS.d/S12-1network: [   16.383831] net eth0: adv: sym 0, asym: 0
udhcpc: started, v1.29.2
udhcpc: sending discover
udhcpc: sending discover
udhcpc: sending discover
udhcpc: sending select for 10.135.13.32
udhcpc: lease of 10.135.13.32 obtained, lease time 43200
Failed to kill daemon: No such file or directory
deleting routes
adding dns 192.168.0.21
adding dns 192.168.0.22
network_ipaddress=10.135.13.32
network_subnet=255.255.255.0
network_router=10.135.13.1
network_dns1=192.168.0.21
network_dns2=192.168.0.22
network_wins1=
network_wins2=
Daemon already running on PID 747
.
Starting mosquitto:.
Starting authmgr: .
Starting eventmgr: Starting eventmgr without support for EcTun
.
Starting iod: .
 * Starting ip filter with iptables...
iptables/ip6tables disabled                                             [ ok ]
Starting syslogd: .
Starting aenc_adec:
 cannot run /var/run/aenc_adec.pid
.
Starting venc: 2021/11/05 11:51:00 Venc version: 2.0.0.1
.
Anubis architecture
router=10.135.13.1
UPnP CP disabled
Starting mod: .
Starting rtsps: run as daemon mode
Starting serverpush: .
Starting httpd: .
https_connect=8080
Starting recorder: .
not found /tmpfs/.ssh_mount
Reloading configuration inetd: .
#ftp    stream  tcp     nowait  root    /usr/sbin/pure-ftpd pure-ftpd -A
ssh    stream  tcp     nowait  root    /usr/sbin/sshd sshd -i -f /etc/conf.d/ssh/sshd_config
Starting inetd: .
Starting upnpdd: enable 1
[  126.865121] ++++clk:37125000+++
.
Starting websocketserver:
======== WebSocket server information ========
Daemon Mode = 1
Sys Log Level = 0
Server Port = 777
PID File = /var/run/websocketserver.pid
Ethernet Interface = /var/run/ws_socket
Web Resource Path = /mnt/ramdisk
SW watchdog monotoring ID = 21
Test Mode = DISABLE
==============================================
.
Starting websocketeventd: Websocketeventd (1.0.0.1 2021/11/01 10:00:00) start.
.
Starting : Starting uartd[0]: .
Starting uartd[1]: .
Starting ibisd: ibisd (1.0.1.1 2021/11/01 13:12:00) is starting up .. debug mode: OFF
.
Starting snapshotd: Total channel num: 1, stream num: 3, default stream ID: 2
Entering daemon mode...
.
Starting onvifactiond: .
Starting vid: Entering daemon mode...
.
Starting smartsd: Entering daemon mode...
.
Starting stormgr:
LogLib Init stormgr successfully, fifo fd 3
SQLite thread status 1
setsockopt() set timeout to 60
Read message failed from client socket fd(3)
Send FIFO  Cmd cmd=createrecording&recToken=99999999999999999999&recName=seamless recording - channel 1&recSourceID=http://www.w3.org/2005/08/addressing/anonymous&recLocation=from script: update_recordingtoken&recDescription=NativeAPI-seamless0&recAddress=http://www.w3.org/2005/08/addressing/anonymous&recContent=Content Description&maximumRetentionTime=PT0S&dest=cf
[  127.708580] random: crng init done
[  127.711968] random: 4 urandom warning(s) missed due to ratelimiting
.
Starting gsensor: Enable G sensor count : 1 (Channel : 1)
Support Shock Alarm detection
G Sensor device 0 layout is 23
.
.
test network status...
Check network...
killall: imgbufmgr: no process killed
recording_i0_trigger=schedule
recording_i0_enable=0
recording_i0_priority=1
recording_i0_source=0
recording_i0_notify=1
recording_i0_notifyserver=0
recording_i0_weekday=127
recording_i0_begintime=00:00
recording_i0_endtime=24:00
recording_i0_prefix=
recording_i0_dest=cf
recording_i0_adaptive_enable=0
recording_i0_adaptive_preevent=1
recording_i0_maxduration=60
recording_i0_maxsize=100
recording_i0_cffolder=
recording_i1_trigger=schedule
recording_i1_enable=0
recording_i1_priority=1
recording_i1_source=0
recording_i1_notify=1
recording_i1_notifyserver=0
recording_i1_weekday=127
recording_i1_begintime=00:00
recording_i1_endtime=24:00
recording_i1_prefix=
recording_i1_dest=cf
recording_i1_adaptive_enable=0
recording_i1_adaptive_preevent=1
recording_i1_maxduration=60
recording_i1_maxsize=100
recording_i1_cffolder=
config file parse OK!!
Sector[0] = 10731520
Sector[1] = 10731520
Sector[2] = 5365760
end
config file parse OK!!
Sector[0] = 1310720
end
Send FIFO  Cmd F<control id="8" channel="0" stream="1"><output>stop</output></control>
open fdFIFO fail, errno=6
Send FIFO  Cmd F<control id="8" channel="0" stream="2"><output>stop</output></control>
open fdFIFO fail, errno=6
Send FIFO  Cmd F<control id="8" channel="0" stream="3"><output>stop</output></control>
open fdFIFO fail, errno=6
send bootup command to eventmgr
Send FIFO  Cmd )<control><output>start</output></control>
Send FIFO  Cmd .<message><boot id="0">trigger</boot></message>
recording_i0_trigger=schedule
recording_i0_enable=0
recording_i0_priority=1
recording_i0_source=0
recording_i0_notify=1
recording_i0_notifyserver=0
recording_i0_weekday=127
recording_i0_begintime=00:00
recording_i0_endtime=24:00
recording_i0_prefix=
recording_i0_dest=cf
recording_i0_adaptive_enable=0
recording_i0_adaptive_preevent=1
recording_i0_maxduration=60
recording_i0_maxsize=100
recording_i0_cffolder=
recording_i1_trigger=schedule
recording_i1_enable=0
recording_i1_priority=1
recording_i1_source=0
recording_i1_notify=1
recording_i1_notifyserver=0
recording_i1_weekday=127
recording_i1_begintime=00:00
recording_i1_endtime=24:00
recording_i1_prefix=
recording_i1_dest=cf
recording_i1_adaptive_enable=0
recording_i1_adaptive_preevent=1
recording_i1_maxduration=60
recording_i1_maxsize=100
recording_i1_cffolder=
Enable sysinfo.cgi
Starting ddnsc: DDNS client is disabled
run-parts: /etc/rcS.d/S90ddnsc: exit status 1
Starting onvifd: .
Starting onvifmedia2d: Starting ONVIF Media2 Handler...!
.
Starting onvifeventd: .
Starting onvifstoraged: .
Starting onvifasd: .
Starting onvifdiscovery: .
Reloading configuration httpd: .
Starting genetecevent:
Starting genetecaudiodecode:
Starting genetecptz:
Starting genetecparam:
Starting avahi-daemon: Bonjour is disabled
run-parts: /etc/rcS.d/S99avahid: exit status 1
Starting upload_vadp: .
Starting vadprscmgr: .
Starting vadplic: .
Starting vadpd: .
Starting wifiap .. (3539)
wifi ip: 192.168.1.1
wlan0 is not found
run-parts: /etc/rcS.d/S99wifiap: exit status 1
check apply_patch_after
sh: default: unknown operand
rm: can't remove '/mnt/flash2/patch': Directory not empty

Network-Camera login: root
~ # ifconfig
eth0      Link encap:Ethernet  HWaddr 02:3B:BB:C8:26:7F
          inet addr:10.135.13.32  Bcast:10.135.13.255  Mask:255.255.255.0
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:386 errors:0 dropped:0 overruns:0 frame:0
          TX packets:131 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000
          RX bytes:59888 (58.4 KiB)  TX bytes:11891 (11.6 KiB)
          Interrupt:31

eth0:0    Link encap:Ethernet  HWaddr 02:3B:BB:C8:26:7F
          inet addr:169.254.8.29  Bcast:169.254.255.255  Mask:255.255.0.0
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          Interrupt:31

lo        Link encap:Local Loopback
          inet addr:127.0.0.1  Mask:255.0.0.0
          UP LOOPBACK RUNNING  MTU:65536  Metric:1
          RX packets:106 errors:0 dropped:0 overruns:0 frame:0
          TX packets:106 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000
          RX bytes:13266 (12.9 KiB)  TX bytes:13266 (12.9 KiB)

~ # 10.135.13.3210.135.13.32
