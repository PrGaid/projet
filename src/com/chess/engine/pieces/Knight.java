package com.chess.engine.pieces;

import com.chess.engine.Alliance.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.Tile;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece{

    private final static int[] CONDIDATE_MOVE_COORDINATE = { -17, -15, -10, -6, 6, 10, 15, 17 } ;
    Knight(final int piecePosition,final Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public List<Move> calculateLegaleMoves(Board board) {
                   final List<Move> legalMoves= new ArrayList<>();
        int cindidateDistinatioCoordinate;
        for (final int curentCondidate: CONDIDATE_MOVE_COORDINATE) {

            cindidateDistinatioCoordinate = this.piecePosition + curentCondidate;

            if (true){
                //possible maivaise copie//
                final Tile candidateDestinationTile= board.getTile(candidateDestinationCoordinate);
                if (!candidateDestinationTile.isTileOccupied()){
                             legalMoves.add(new Move());}

                             else {
                                 final  Piece pieceAtDestination = candidateDestinationTile.getPiece();
                                 final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();}

                             if (this.pieceAlliance != pieceAlliance) {
                                 legalMoves.add(new Move());
                             }
                    }
                }
            }

        }




        return ImmutableList.copyOf(legalMoves);
    }
                }

