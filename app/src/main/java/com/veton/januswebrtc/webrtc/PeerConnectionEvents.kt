package com.veton.januswebrtc.webrtc

import com.veton.januswebrtc.janus.JanusConnection
import org.webrtc.IceCandidate
import org.webrtc.SessionDescription
import org.webrtc.StatsReport
import java.math.BigInteger

interface PeerConnectionEvents {
    /**
     * Callback fired once local SDP is created and set.
     */
    fun onLocalDescription(sdp: SessionDescription?, handleId: BigInteger?)


    fun onRemoteDescription(sdp: SessionDescription?, handleId: BigInteger?)

    /**
     * Callback fired once local Ice candidate is generated.
     */
    fun onIceCandidate(candidate: IceCandidate?, handleId: BigInteger?)

    /**
     * Callback fired once local ICE candidates are removed.
     */
    fun onIceCandidatesRemoved(candidates: Array<IceCandidate?>?)

    /**
     * Callback fired once connection is established (IceConnectionState is
     * CONNECTED).
     */
    fun onIceConnected()

    /**
     * Callback fired once connection is closed (IceConnectionState is
     * DISCONNECTED).
     */
    fun onIceDisconnected()

    /**
     * Callback fired once peer connection is closed.
     */
    fun onPeerConnectionClosed()

    /**
     * Callback fired once peer connection statistics is ready.
     */
    fun onPeerConnectionStatsReady(reports: Array<StatsReport?>?)

    /**
     * Callback fired once peer connection error happened.
     */
    fun onPeerConnectionError(description: String?)

    /**
     * Callback fired when new connection comes.
     */
    fun onRemoteRender(connection: JanusConnection?)
}